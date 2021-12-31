/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-12-31 15:06 星期五
 * ==============   ===============     =================================
 */
package com.guying.rbac.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.toolkit.StringPool;

import java.util.ArrayList;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-12-31 15:06 星期五
 */
public class MysqlGenerator {
    public static void Generator(String[] tableName) {

        String projectPath = System.getProperty("user.dir");

        //============================== 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/springboot-mybatisplus/src/main/java")
          .setActiveRecord(true)// 是否支持 AR
          .setAuthor("fulin") //设置作者名字
          .setFileOverride(true) //文件覆盖(全新文件)
          .setIdType(IdType.AUTO)//主键策略
          .setBaseResultMap(true) //SQL 映射文件
          .setBaseColumnList(true)//SQL 片段
          .setOpen(false);
        //============================== 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MARIADB)
           .setUrl("jdbc:mariadb://localhost:3306/test")
           .setDriverName("org.mariadb.jdbc.Driver")
           .setUsername("root")
           //.setSchemaName("public")
           .setPassword("123456");
        //==============================包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.maoxs")//配置父包路径
          .setModuleName("base")//配置业务包路径
          .setMapper("mapper")
          .setEntity("entity")
          .setService("service")
          .setController("controller");
        //.setServiceImpl("service.impl"); 会自动生成 impl，可以不设定
        //============================== 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + "/springboot-mybatisplus/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        //============================== 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel)//设置命名规则  underline_to_camel 底线变驼峰
                .setColumnNaming(NamingStrategy.underline_to_camel)//设置设置列命名  underline_to_camel 底线变驼峰
                //.setSuperEntityClass("com.maoxs.pojo")//设置继承类
                //.setSuperControllerClass("com.maoxs.controller")//设置继承类
                .setEntityLombokModel(true)//是否加入lombok
                .setInclude(tableName)//设置表名
                //.setSuperEntityColumns("id") //设置超级超级列
                .setControllerMappingHyphenStyle(true)//设置controller映射联字符
                .setTablePrefix(pc.getModuleName() + "_");//表的前缀
        //============================== 生成配置
        AutoGenerator mpg = new AutoGenerator();
        mpg.setCfg(cfg)
           .setTemplate(new TemplateConfig().setXml(null))
           .setGlobalConfig(gc)
           .setDataSource(dsc)
           .setPackageInfo(pc)
           .setStrategy(strategy)
           // 选择 freemarker 引擎需要指定如下加，注意 pom 依赖必须有！
           .setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
    public static void main(String[] args) {
        Generator(new String[]{"x", "xx"});
    }
————————————————
    版权声明：本文为CSDN博主「MelancholyCat」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
    原文链接：https://blog.csdn.net/qq_32867467/article/details/82944674
}

///*
// * 修改说明：
// * ==============   ===============     =================================
// *      操作          用户                  日期
// * ==============   ===============     =================================
// *      新增          CODE POTER          2020-07-18 11:44 星期六
// * ==============   ===============     =================================
// */
//package com.guying.rbac.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
///**
// * 描述：MyBatis系统配置
// * 扫描 "com.guying.pms.**.mapper"
// *
// * @author CODE POTER
// * @version 1.0
// * @date 2020-07-18 11:44 星期六
// */
//@Configuration
//@MapperScan("com.guying.rbac.**.repository")
//public class MyBaitsConfig {
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setTypeAliasesPackage("com.guying.rbac.**.entity");
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactory.setMapperLocations(resolver.getResources("classpath*:com/guying/rbac/**/repository/**.xml"));
//
//        return sessionFactory.getObject();
//    }
//}

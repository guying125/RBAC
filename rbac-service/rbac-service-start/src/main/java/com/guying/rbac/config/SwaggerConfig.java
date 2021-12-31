/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2020-07-18 10:47 星期六
 * ==============   ===============     =================================
 */
package com.guying.rbac.config;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：Swagger系统配置
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2020-07-18 10:47 星期六
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 扫描接口包路径
     */
    private static final String BASE_PACKAGE = "com.guying.rbac.web";

    @Value("${swagger.enabled}")
    private Boolean showSwagger;

    @Profile({"dev"})
    @Bean
    public Docket createRestApi() {
        // 添加请求参数，我们这里把token作为请求头部参数传入后端
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        List<Parameter>  parameters       = new ArrayList<>();
        parameterBuilder.name("token")
                        .description("令牌")
                        .modelRef(new ModelRef("string"))
                        .parameterType("header")
                        .required(false)
                        .build();

        parameters.add(parameterBuilder.build());

        if (BooleanUtils.isNotTrue(showSwagger)) { showSwagger = Boolean.FALSE; }

        return new Docket(DocumentationType.SWAGGER_2).enable(showSwagger)  //是否展示swagger-ui
                                                      .apiInfo(apiInfo())
                                                      .select()
                                                      .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                                                      .paths(PathSelectors.any())
                                                      .build()
                                                      .globalOperationParameters(parameters);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("权限管理系统 Permission Management Systems")    // 接口文档名
                .description("权限管理系统接口文档说明")    // 说明
                .termsOfServiceUrl("http://localhost:8080/pms")
                .contact(new Contact("guying", "", "yqj_guying@163.com")) // 邮箱
                .version("1.0")
                .build();
    }
}

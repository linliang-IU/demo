package com.example.testDemo.configuration;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*@Configuration 注解制定了spring要加载这个类 @EnableSwagger2注解开启swagger功能 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())

                .select()

                .apis(RequestHandlerSelectors.basePackage("com.example.testDemo.controller"))

                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))

                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))

                .paths(PathSelectors.any())

                .build();

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("aaa")
                .description("bbb")
                .termsOfServiceUrl("ccc")
                .contact("ddd")
                .version("1.0")
                .build();
    }




}

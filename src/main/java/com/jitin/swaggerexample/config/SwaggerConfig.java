package com.jitin.swaggerexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.jitin.swaggerexample.controller")) //--For all controllers
				//.paths(PathSelectors.ant("/test")) //--For Specific method
				//.paths(PathSelectors.ant("/cntlr2/**")) //--For Specific controller
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("My REST API", "Description of API.", "1.0", "Terms of service", "Contact Name",
				"License", "LicenseUrl");
	}
}

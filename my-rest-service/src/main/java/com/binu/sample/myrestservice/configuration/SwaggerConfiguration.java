package com.binu.sample.myrestservice.configuration;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	public static final ApiInfo MY_API_INFO=new ApiInfo("My RestService", "My RestService", "1.0", "termsOfServiceUrl", "contact", "license", "licenseUrl");
	
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(MY_API_INFO);
	}
	
}

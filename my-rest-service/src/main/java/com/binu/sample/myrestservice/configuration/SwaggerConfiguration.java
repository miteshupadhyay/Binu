package com.binu.sample.myrestservice.configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.binu.sample.myrestservice.controller.PersonController;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
 
	public static final ApiInfo MY_API_INFO=new ApiInfo("My RestService", "My RestService", "1.0", "termsOfServiceUrl", "contact", "license", "licenseUrl");
	
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES=
			new HashSet<String>(Arrays.asList("application/json","application/xml"));
				
	
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(MY_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
	
}

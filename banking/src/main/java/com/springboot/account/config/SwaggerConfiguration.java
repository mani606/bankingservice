package com.springboot.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	public Docket bookingApi() {
		return new Docket(DocumentationType.SWAGGER_2)          
				.select()                                       
				.apis(RequestHandlerSelectors.basePackage("com.springboot.account"))
				.paths(PathSelectors.ant("/**"))                     
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return ApiInfo(
				"banking application REST API", 
				"banking application REST API Documentatoion", 
				"API TOS", 
				"Terms of service", 
				new Contact(), 
				"License of API", "API license URL");
    }

	private ApiInfo ApiInfo(String string, String string2, String string3, String string4, Contact contact,
			String string5, String string6) {
		// TODO Auto-generated method stub
		return null;
	}
}


package com.devsuperior.dssalesapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	final static String SITE = "https://www.linkedin.com/in/rafael-amaral-449558148/";
	final static String EMAIL = "rafaelpaulajr@gmail.com";
	 
	
	@Bean
	public Docket api() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.devsuperior.dssalesapi.controller"))
						.paths(PathSelectors.any())
						.build()
						.apiInfo(new ApiInfoBuilder()
						.title("API DS-Vendas")
						.description("API para gerenciamento de vendas por meio de gráficos e tabelas , "
								+ " desenvolvida na semana Spring & React evento organizado pela DevSuperior.")
						.contact(new Contact("Rafael Amaral", SITE, EMAIL))
						.build());
								
						
		return docket;
	}

}

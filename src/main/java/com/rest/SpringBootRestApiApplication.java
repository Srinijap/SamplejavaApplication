package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.rest")
@EnableSwagger2
public class SpringBootRestApiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}
	@Bean
	public Docket api() {
		System.out.println("object created..");
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.rest")).build();
	}

}

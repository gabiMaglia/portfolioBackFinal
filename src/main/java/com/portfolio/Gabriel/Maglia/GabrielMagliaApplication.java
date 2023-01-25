package com.portfolio.Gabriel.Maglia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
public class GabrielMagliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GabrielMagliaApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://portfolio-375818.web.app").allowedMethods("GET","POST", "PUT", "DELETE", "OPTIONS").allowedHeaders("header1", "header2", "header3");
			}
		};
	}

}

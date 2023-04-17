package com.aljimez.T23C4;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class webConfiguration implements WebMvcConfigurer{

	 public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("*").allowedOrigins("*").allowedMethods("*");
	    }
	
}

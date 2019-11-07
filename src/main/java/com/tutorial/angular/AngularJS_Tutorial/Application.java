package com.tutorial.angular.AngularJS_Tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	/*
	 * Configurar fuentes estaticas
	 * http://zetcode.com/springboot/static/
	 * 
	 * */
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

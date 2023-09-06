package com.example.restcrudmndb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestcrudmndbApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestcrudmndbApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(RestcrudmndbApplication.class, args);
	}

}

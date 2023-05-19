package com.RedmineApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RedmineApiApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(RedmineApiApplication.class);
	}
	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/redmine");
		SpringApplication.run(RedmineApiApplication.class, args);
	}
}

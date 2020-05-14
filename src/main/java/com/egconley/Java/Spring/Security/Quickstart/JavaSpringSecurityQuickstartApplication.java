package com.egconley.Java.Spring.Security.Quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:auth0.properties")
})
public class JavaSpringSecurityQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringSecurityQuickstartApplication.class, args);
	}

}

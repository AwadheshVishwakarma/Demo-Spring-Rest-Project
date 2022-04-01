package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@EnableAutoConfiguration
@EnableWebMvc //for the rest application implementaion we need to do enable
public class DemoSpringRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringRestProjectApplication.class, args);
	}

}

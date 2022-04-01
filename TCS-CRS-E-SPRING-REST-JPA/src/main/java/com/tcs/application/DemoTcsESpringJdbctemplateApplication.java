package com.tcs.application;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.tcs.dao.StudentDAOImpl;
import com.tcs.model.Student;

@SpringBootApplication
@ComponentScan({ "com.tcs.*" })
@EnableAutoConfiguration
@EnableWebMvc // For the REST implementation we need to do the this annotation enable
public class DemoTcsESpringJdbctemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTcsESpringJdbctemplateApplication.class, args);
		
	
	}
}

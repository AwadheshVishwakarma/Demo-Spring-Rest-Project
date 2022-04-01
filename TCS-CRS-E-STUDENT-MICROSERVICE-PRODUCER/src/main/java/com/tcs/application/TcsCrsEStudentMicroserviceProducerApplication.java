package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@EnableAutoConfiguration
@EnableWebMvc
@EnableDiscoveryClient
@EnableJpaRepositories("com.tcs.repository")
@EntityScan("com.tcs.entity")
public class TcsCrsEStudentMicroserviceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsCrsEStudentMicroserviceProducerApplication.class, args);
	}

}

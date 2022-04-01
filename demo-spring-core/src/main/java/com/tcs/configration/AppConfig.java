/**
 * 
 */
package com.tcs.configration;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;





/**
 * @author springuser03
 *
 */
@Configuration
@Import({HelloAppConfig.class,CustomerAppConfig.class})
public class AppConfig {
	/*
	 * @Bean(name="helloBean") public HelloWorld helloWorld() { return new
	 * HelloWorldImpl();
	 * 
	 * }
	 */
}

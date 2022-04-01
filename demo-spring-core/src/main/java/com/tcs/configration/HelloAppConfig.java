/**
 * 
 */
package com.tcs.configration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;

/**
 * @author springuser03
 *
 */


public class HelloAppConfig {
	
	  @Bean(name="helloBean")
	  public HelloWorld helloWorld() { 
		  return new HelloWorldImpl();
	  
	 }
	 
}

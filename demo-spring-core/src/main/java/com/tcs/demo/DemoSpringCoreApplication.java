package com.tcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.tcs.configration.AppConfig;
import com.tcs.configration.CustomerAppConfig;
import com.tcs.service.CustomerInterface;
import com.tcs.service.HelloWorld;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@Import({AppConfig.class})
@EnableAutoConfiguration
public class DemoSpringCoreApplication {

	public static void main(String[] args) {
		/*
		 * SpringApplication.run(DemoSpringCoreApplication.class, args);
		 * System.out.println("inside spring this is my first project");
		 */
		ApplicationContext context =SpringApplication.run(AppConfig.class);
		HelloWorld obj =(HelloWorld) context.getBean("helloBean");
		obj.printHelloWorld("SPRING Application for configration main classes");
		
		
		CustomerInterface obj1 =(CustomerInterface) context.getBean("CustomerhelloBean");
		obj1.CustomerCreate("welcome to Customer create method ");
		obj1.ShowCustomer("welcome to  ShowCustomer method ");
		obj1.DeleteCustomer("welcome to  DeleteCustomer method ");


		
	}

}

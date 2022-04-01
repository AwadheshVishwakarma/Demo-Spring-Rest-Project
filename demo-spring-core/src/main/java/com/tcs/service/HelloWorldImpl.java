/**
 * 
 */
package com.tcs.service;

import org.springframework.stereotype.Component;

/**
 * @author springuser03
 *
 */
@Component
public class HelloWorldImpl implements HelloWorld {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		
		public String printHelloWorld(String msg) {
			System.out.println("HELLO:" +msg);
			return "Hello :" +msg;
			
		}

	}



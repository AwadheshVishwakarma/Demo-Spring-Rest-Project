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
public class CustomerInterfaceImpl implements CustomerInterface {
	public String CustomerCreate(String msg) {
		System.out.println("HELLO:" +msg);
		return "Hello CustomerCreate :" +msg;
		
		
	}
	public String ShowCustomer(String var){
		System.out.println("HELLO:" +var);
		return "Hello ShowCustomer :" +var;
		
	}
	public String DeleteCustomer(String var2) {
		System.out.println("HELLO:" +var2);
		return "Hello DeleteCustomer :" +var2;
		
	}

}

/**
 * 
 */
package com.tcs.RestController;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.model.Customer;

/**
 * @author springuser03
 *
 */
@RestController
public class CustomerController {

	//hit url on brower for details	
	@RequestMapping(method = RequestMethod.GET,value = "/HelloWorld")
	public String helloWorld() {
		
		
		return "Hello World";
	}
	

		//hit url on brower for details	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,  method = RequestMethod.GET,
		    value = "/details")
		@ResponseBody
	 public Customer details(){
		//hard coded value inside the bean classes
		Customer c1=new Customer();
		c1.setCustomerid(101); 
		c1.setCustomerName("amit");
		c1.setCustomerAddress("DELHI");
			
		
		return c1;
		   
	}
}

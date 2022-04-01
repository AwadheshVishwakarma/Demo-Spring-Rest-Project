/**
 * 
 */
package com.tcs.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.tcs.service.CustomerInterface;
import com.tcs.service.CustomerInterfaceImpl;
/**
 * @author springuser03
 *
 */
@Configuration
public class CustomerAppConfig {
	@Bean(name="CustomerhelloBean")
	public CustomerInterface customerInterface() {
		return new CustomerInterfaceImpl();

}
}
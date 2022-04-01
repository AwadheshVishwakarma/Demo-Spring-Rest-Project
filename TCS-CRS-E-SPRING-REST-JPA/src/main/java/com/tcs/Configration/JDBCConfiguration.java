/**
 * 
 */
package com.tcs.Configration;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.tcs.mapper.StudentMapper;
import com.tcs.model.Student;

/**
 * @author springuser01
 *
 */
@PropertySource("classpath:application.properties")
@Configuration
public class JDBCConfiguration {
	/**
	 * This is used to Autowire JDBCConfiguration bean
	 */
	@Autowired
	Environment environment;

	/**
	 * @return This is used to initialize DriverManagerDataSource.
	 */
	@Bean
	DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("spring.datasource.url"));
		dataSource.setUsername(environment.getProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(environment.getProperty("spring.datasource.driverClassName"));

		return dataSource;
	}

	/**
	 * @return This is used to return jdbcTemplate object.
	 */
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	

	

	


}
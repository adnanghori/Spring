package com.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public Student getStudent() {
		 Student student = new Student();
		 return student;
	}
}

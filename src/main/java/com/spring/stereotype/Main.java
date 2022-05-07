package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/configuration.xml");
		Student bean = context.getBean("student",Student.class);
		System.out.println(bean.hashCode());
		Student bean2 = context.getBean("student",Student.class);
		System.out.println(bean2.hashCode());
	}
} 
 
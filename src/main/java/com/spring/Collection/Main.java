package com.spring.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Collection/configuration.xml");
		Collection bean = context.getBean("Spring",Collection.class);
		System.out.println(bean);
	}
}

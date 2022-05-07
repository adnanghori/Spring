package com.spring.expression;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/expression/configuration.xml");
		Test bean = context.getBean("test",Test.class);
		System.out.println(bean.getTest());
		Scanner sc = new Scanner(System.in);
		sc.close();
		
	}
}

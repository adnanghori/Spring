package com.spring.beanautowiring;

import org.springframework.stereotype.Component;

@Component
public class Study {
	public void getInfo() {
		System.out.println("Studying");
	}
}

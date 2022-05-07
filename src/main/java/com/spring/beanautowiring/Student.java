package com.spring.beanautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	private Study study;
	public void about() {
		System.out.println("Testing");
		study.getInfo();
	}
	public Student(Study study) {
		super();
		this.study = study;
	}
	public Study getStudy() {
		return study;
	}
	public void setStudy(Study study) {
		this.study = study;
	}
}

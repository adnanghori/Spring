package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("Test1")
	private School school;

	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Student(School school) {
		super();
		this.school = school;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

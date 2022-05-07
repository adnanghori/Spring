package com.spring.setter_injection.life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int employeeSalary;
	private String employeeName;
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeSalary=" + employeeSalary + ", employeeName=" + employeeName + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Created");
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroyed");
	}
}

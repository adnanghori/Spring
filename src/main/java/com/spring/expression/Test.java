package com.spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {
	@Value("#{T(com.spring.expression.Static).m1(10,20)}")
  private int a;
	@Value("#{T(com.spring.expression.Static).x}")
  private int b;
  private int c;
  @Value("#{new java.lang.String('Adnan')}")
  private  String test;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public int getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
public String getTest() {
	return test;
}
@Override
public String toString() {
	return "Test [a=" + a + ", b=" + b + ", c=" + c + "]";
} 
}

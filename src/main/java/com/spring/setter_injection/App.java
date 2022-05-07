package com.spring.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.setter_injection.life_cycle.Employee;


public class App 
{
	
    public static void main( String[] args )
    {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setter_injection/configuration.xml");
        Employee e = (Employee) context.getBean("lifecycle");
        System.out.println(e);
        context.close();
    }
}

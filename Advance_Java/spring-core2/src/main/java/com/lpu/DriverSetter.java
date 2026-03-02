package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverSetter {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee e = ac.getBean("employee", Employee.class);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
		
		
	}
}

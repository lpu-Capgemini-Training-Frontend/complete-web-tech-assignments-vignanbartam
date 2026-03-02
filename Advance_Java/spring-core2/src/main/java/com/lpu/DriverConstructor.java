package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverConstructor {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee1 e = ac.getBean("employee1", Employee1.class);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
	}
}

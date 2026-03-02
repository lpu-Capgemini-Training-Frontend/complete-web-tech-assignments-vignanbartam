package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverCollege {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		College c = ac.getBean("college", College.class);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getLocation());
		System.out.println(c.getDepartment());
	}
}

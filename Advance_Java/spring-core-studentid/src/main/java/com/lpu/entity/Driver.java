package com.lpu.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Student s = ac.getBean("student", Student.class);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		StudentIdCard sic = s.getSic();
		
		System.out.println(sic.getRollNo());
		System.out.println(sic.getBrance());
		System.out.println(sic.getPhoneNo());
		
	}
}

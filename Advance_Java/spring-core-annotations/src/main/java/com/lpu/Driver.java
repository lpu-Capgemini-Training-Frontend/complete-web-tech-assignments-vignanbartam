package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jakarta.persistence.EntityManagerFactory;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		EntityManagerFactory emf = ac.getBean(EntityManagerFactory.class);
//		Student s = ac.getBean("myStudent", Student.class);
		
		
		System.out.println(emf);
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		s.study();
//		Employee e = ac.getBean("employee", Employee.class);
//		e.work();
		
		
	}
}

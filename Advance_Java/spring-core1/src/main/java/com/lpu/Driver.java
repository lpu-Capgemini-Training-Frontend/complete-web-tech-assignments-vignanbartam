package com.lpu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lpu.college1.College;

import io.micrometer.common.KeyValue;

public class Driver {

	public static void main(String[] args) {
		
//		BeanFactory b;
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
//		System.out.println("main started");
//		Student s = ac.getBean("myStudent", Student.class);//IOC
//		s.study();
//		System.out.println("main ended");
//		
//		College c = ac.getBean("myCollege", College.class);
//		c.course();
//		
//		Employee e = ac.getBean("emp", Employee.class);
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		
//		Laptop l = e.getL();
//		l.start();
//		System.out.println(l);
		
		ListMap lm = ac.getBean("listandMap", ListMap.class);
		for(int i : lm.getL()) {
			System.out.println(i);
		}
		for(int i : lm.getHp().keySet()) {
			System.out.println(i + " " + lm.getHp().get(i));
		}
	}

}

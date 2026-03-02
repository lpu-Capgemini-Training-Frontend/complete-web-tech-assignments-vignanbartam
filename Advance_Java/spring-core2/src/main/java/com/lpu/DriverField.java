package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverField {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Trainers t = ac.getBean("myTrainer", Trainers.class);
		
		System.out.println(t.getTrainerId());
		System.out.println(t.getTrainerName());
		System.out.println(t.getTrainerSubject());
		
	}
}

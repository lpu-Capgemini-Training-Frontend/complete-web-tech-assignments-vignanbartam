package com.lpu;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarController {
	 public static void main(String args[]) {
		  
		    ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		    
		    CarService s=context.getBean("carService",CarService.class);
		    Car c=context.getBean("car",Car.class);
		   
		    s.insertCar(c);		    
		    
		    
		    
	  }
}

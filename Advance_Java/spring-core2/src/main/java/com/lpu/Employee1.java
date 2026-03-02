package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee1 {
	private int id;
	private String name;
	private double sal;
	public Employee1(@Value("101") int id, @Value("Rishi") String name, @Value("12000") double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
//	public Employee1() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
}

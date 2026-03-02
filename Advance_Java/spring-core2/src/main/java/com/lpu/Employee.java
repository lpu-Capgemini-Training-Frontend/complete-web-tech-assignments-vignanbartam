package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//setter to declare value
@Component
public class Employee {
	private int id;
	private String name;
	private double sal;
	
	
	public int getId() {
		return id;
	}
	@Value("111")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("RISHI")
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	@Value("3000")
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}

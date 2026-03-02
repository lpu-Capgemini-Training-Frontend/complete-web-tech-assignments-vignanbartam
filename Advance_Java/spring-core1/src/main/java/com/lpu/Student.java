package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
	
	@Value("101")
	private int id;
	@Value("RAJU")
	private String name;
	
	
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


	public void study() {
		System.out.println("Studying");
	}
}

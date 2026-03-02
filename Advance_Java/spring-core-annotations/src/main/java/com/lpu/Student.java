package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value = "myStudent")// if not given any value then it will take class name as default but 1st letter will be lower case
public class Student {
	public void study() {
		System.out.println("sleeping");
	}

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
}

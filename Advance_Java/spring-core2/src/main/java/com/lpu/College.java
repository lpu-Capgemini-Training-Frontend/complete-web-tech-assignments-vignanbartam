package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("101")
	private int id;
	private String name;
	private String location;
	private String department;
	public College( @Value("Poori") String name, @Value("phg") String location) {
		this.name = name;
		this.location = location;
	}
	


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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	@Value("b-tech")
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}

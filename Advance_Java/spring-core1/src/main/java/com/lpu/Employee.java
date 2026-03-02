package com.lpu;

public class Employee {
	private int id;
	private String name;
	private Laptop l;
	
	
	
	public Employee(int id, String name, Laptop l) {
		this.id = id;
		this.name = name;
		this.l = l;
	}
	
	public Employee() {
		
	}

	public Laptop getL() {
		return l;
	}
	public void setL(Laptop l) {
		this.l = l;
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
	
	
}

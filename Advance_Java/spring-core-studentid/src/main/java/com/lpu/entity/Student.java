package com.lpu.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("11")
	private int id;
	@Value("Rishi")
	private String name;

//	@Autowired
	private StudentIdCard sic;
	
	@Autowired
	public Student(StudentIdCard sic) {
		super();
		this.sic = sic;
	}

	public StudentIdCard getSic() {
		return sic;
	}

	public void setSic(StudentIdCard sic) {
		this.sic = sic;
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

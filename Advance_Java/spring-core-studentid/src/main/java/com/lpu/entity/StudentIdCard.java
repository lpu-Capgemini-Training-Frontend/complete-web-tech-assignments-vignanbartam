package com.lpu.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentIdCard {
	@Value("12214337")
	private int rollNo;
	@Value("CSE")
	private String Brance;
	@Value("8688179553")
	private long phoneNo;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getBrance() {
		return Brance;
	}
	public void setBrance(String brance) {
		Brance = brance;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}

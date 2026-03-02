package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myTrainer")
public class Trainers {
	
	@Value("101")
	private int trainerId;
	@Value("Sandeep")
	private String trainerName;
	@Value("Advance-Java")
	private String trainerSubject;
	
	
	
	
	public String getTrainerSubject() {
		return trainerSubject;
	}
	public void setTrainerSubject(String trainerSubject) {
		this.trainerSubject = trainerSubject;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	
}

package com.lpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {
	
	@Autowired
	private CarCRUD cc;

	
	   public void insertCar(Car c) {
		      cc.insert(c);
	   }
	   
	   public void updateCar(int id, String brand) {
		     cc.update(id, brand);
	   }
	   
	   public void deleteCar(int id) {
		     cc.delete(id);
	   }
	   
	   public Car readCar(int id) {
		     return cc.read(id);
	   }

}
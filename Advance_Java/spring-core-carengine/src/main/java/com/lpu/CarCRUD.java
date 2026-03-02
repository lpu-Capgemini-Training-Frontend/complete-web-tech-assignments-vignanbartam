package com.lpu;

public interface CarCRUD {
	void insert(Car c);
	  
	  void update(int id,String brand);
	  
	  void delete(int id);
	  
	  Car read(int id);
}

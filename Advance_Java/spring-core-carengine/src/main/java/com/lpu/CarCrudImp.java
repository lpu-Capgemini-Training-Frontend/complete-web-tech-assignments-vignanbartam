package com.lpu;

import org.springframework.stereotype.Component;

import com.lpu.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

@Component
public class CarCrudImp implements CarCRUD{

	
	

	EntityManager em=JpaUtil.getManager();

	@Override
	public void insert(Car c) {
		
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.persist(c);
		transaction.commit();
		
		
	}

	@Override
	public void update(int id,String brand) {
		
		 EntityTransaction transaction=em.getTransaction();
		 Car c1=em.find(Car.class,id);
		 transaction.begin();
		 c1.setBrand(brand);
		 em.merge(c1);
		 transaction.commit();
		
	}

	@Override
	public void delete(int id) {
		EntityTransaction transaction=em.getTransaction();
		Car c1=em.find(Car.class,id);
		transaction.begin();
		em.remove(c1);
		transaction.commit();
		
	}

	@Override
	public Car read(int id) {
		
		  return em.find(Car.class,id);
	}

}

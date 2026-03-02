package com.lpu;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
@Component
public class Dao {
	@Autowired
	EntityManagerFactory emf;
	
	public void addRegister(Employee e) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(e);
		et.commit();
	}
	public void updateEmployee(Employee e) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(e);
		et.commit();
	}
	public Employee findEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		
		return em.find(Employee.class, id);
	}
	public void deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e = em.find(Employee.class, id);
		
		et.begin();
		em.remove(e);
		et.commit();
	}
	public List<Employee> findallEmployee(){
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select e from Employee e");
		List<Employee> list = query.getResultList();
		
		return list;
	}
}

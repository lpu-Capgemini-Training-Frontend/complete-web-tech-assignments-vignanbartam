package com.lpu.util;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	public static EntityManager getManager() {
		return emf.createEntityManager();
	}
}
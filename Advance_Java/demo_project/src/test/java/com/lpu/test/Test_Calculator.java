package com.lpu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.Calculater;

public class Test_Calculator {
//			System.out.println(ans);
	static Calculater c = null;
	@BeforeAll
	public static void CreateObject() {
		System.out.println("unit test started");
		c=new Calculater();
	}
	@Test
	public void testAdd() {
		int ans = c.add(10, 20);
		Assertions.assertEquals(30, ans);
		System.out.println("add");
	}
	@Test
	public void testMulti() {
		int res = c.multi(2,2);
		Assertions.assertEquals(4, res);
		System.out.println("multi");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("close DB connection");
	}
}

package com.lpu.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.PalindromeSPrimeNArmstrongN;

public class Test_PalindromePrimeArmstrong {
	static PalindromeSPrimeNArmstrongN p = null;
	
	@BeforeAll
	public static void create() {		
		p=new PalindromeSPrimeNArmstrongN();
	}
	
	@Test
	public void testPalindrome() {
		boolean ans = p.checkPalindrome("NamaN");
		Assertions.assertEquals(true, ans);
	}
	
	@Test
	public void testPrime() {
		boolean ans = p.checkPrime(5);
		Assertions.assertEquals(true, ans);
	}
	@Test
	public void testArmstrong() {
		boolean ans=p.checkArmstrong(123);
		Assertions.assertEquals(false, ans);
	}
}

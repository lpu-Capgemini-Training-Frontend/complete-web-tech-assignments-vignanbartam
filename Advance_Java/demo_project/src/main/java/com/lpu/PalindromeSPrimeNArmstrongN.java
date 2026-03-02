package com.lpu;

public class PalindromeSPrimeNArmstrongN {
	public boolean checkPalindrome(String a) {
		StringBuilder sb = new StringBuilder(a);
		String b = sb.reverse().toString();
		if(a.equals(b)) return true;
		else return false;
	}
	public boolean checkPrime(int a) {
		if(a<0) return false;
		if(a==2) return true;
		for(int i=3; i<a; i++) {
			if(a%i==0) return false;
		}
		return true;
	}
	public boolean checkArmstrong(int a) {
		int a1=a;
		int ans=a;
		int sum=0;
		int count=0;
		while(a1>0) {
			count++;
			a1/=10;
		}
		while(a>0) {
			int temp = a%10;
			sum += Math.pow(temp, count);
			a/=10;
		}
		if(sum==ans) return true;
		else return false;
	}
}

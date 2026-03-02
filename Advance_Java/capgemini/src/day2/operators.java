package day2;
import java.util.*;
public class operators {
	public static void main(String[] args){
		//rich or not rich
//		int a = 100000;
//		String r = (a>=100000) ? "Rich" : "Not Rich" ;
//		System.out.println(r);
		
		//greatest number
//		int b = 99; int c = 35;
//		int re = (b>c) ? b : c;
//		System.out.println(re);
		
//		int x = 5; int y = 6; int z = 7;
//		int res = (x>y && x>z) ? x : (y>z) ? y : z;
//		System.out.println(x++ + ++x);
		
		//Even or odd
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int x = sc.nextInt();
//		String res = (x%2 == 0) ? "Even Number" : "Odd Number";
//		System.out.println(res);
		
		//divisible by 5 & 11 or not
//		System.out.println("Enter a number: ");
//		int x = sc.nextInt();
//		String res = ((x%5 == 0) && (x%1==0)) ? "Divisible by both 5 & 11" : "Not divisible by both 5 & 11";
//		String r = (x%5 == 0) ? (x%11 == 0) ? "Divisible by both 5 & 11" : "Divisible by 5 Not by 11" : "not divisible by both 5 & 11";
//		System.out.println(r);
		
		//character is in uppercase or not
		char ch = 'A';
		String r = ((ch > 64) && (ch < 91)) ? "Upper case" : "Not upper case";
		System.out.println(r);
	}
}
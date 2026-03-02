package day4;
import java.util.*;
public class DOWhile {

	public static void main(String[] args) {
		
		//factorial of a number
		
		
//		Scanner sc = new Scanner(System.in);
//		char key;
//		do{
//			System.out.println("enter a number");
//			int a = sc.nextInt();
//			int sum=1;
//			for(int i=a; i>1; i--) {
//				sum *= i;
//			}
//			System.out.println("Factorial of the number is " + sum);
//			System.out.println("Enter y to continue other key to exit");
//			String k = sc.next().toLowerCase();
//
//			key=k.charAt(0);
//		} while(key=='y');
		
		
		
		//a^b
		
//		Scanner sc = new Scanner(System.in);
//		char key;
//		do{
//			System.out.println("enter a 1st number");
//			int a = sc.nextInt();
//			System.out.println("enter a 2nd number");
//			int b = sc.nextInt();
//			int sum = 1;
//			for(int i=0; i<b; i++) {
//				sum *= a;
//			}
//			System.out.println("square of " + a + " power " + b + " is " + sum);
//			System.out.println("Enter y to continue other key to exit");
//			String k = sc.next().toLowerCase();
//
//			key=k.charAt(0);
//		} while(key=='y');
		
		
		
		
		// if negative number given then exit
		
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		int a=0;
//		do{
//			sum += a;
//			System.out.println("enter a number");
//			a = sc.nextInt();
//			
//		} while(a > 0);
//		System.out.println(sum);
		
		
		
		// ask input until the sum is 100 and print how many inputs have been taken to get sum 100
		
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		int input = 0;
//		int a=0;
//		do{
//			System.out.println("enter a number");
//			a = sc.nextInt();
//			sum += a;
//			input++;
//			
//		} while(sum < 100);
//		System.out.println(input);
		
		
		
		//ask password until it is correct (limit 3)
		
//		Scanner sc = new Scanner(System.in);
//		String password = "Rishith@123";
//		int limit = 3;
//		System.out.println("enter the password");
//		do{
//			String a = sc.nextLine();
//			if(a.equals(password)) {
//				System.out.println("login successful");
//				break;
//			}
//			limit--;
//			if(limit > 0)
//			System.out.println("Try again");
//			
//		} while(limit > 0);
//		if(limit ==0 ) System.out.println("login Failed");
		
		
		
		
		
		// prime number
		
//		Scanner sc = new Scanner(System.in);
//		boolean ans = true;
//		System.out.println("enter a number");
//		int a = sc.nextInt();
//		for(int i=2; i<a; i++) {
//			if(a % i == 0) {
//				ans=false;
//			}
//		}
//		
//		if(ans) {
//			System.out.println("prime number");
//		} else {
//			System.out.println("Not prime number");
//		}
		
		
		
		//Reverse a number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int rev=0;
		while(a>0) {
			int l = a%10;
			rev = rev*10 +l;
			a/=10;
		}
		System.out.println(rev);
	}

}

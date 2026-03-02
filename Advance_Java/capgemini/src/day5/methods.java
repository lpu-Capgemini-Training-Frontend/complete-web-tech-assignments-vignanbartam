package day5;
import java.util.Scanner;
public class methods {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for Division\nEnter 5 for modules\nEnter a price and b discount to get discount of b on a");
		int n = sc.nextInt();
		switch(n) {
		case 1:
		{
			add(a, b);
			break;
		}
		case 2:
		{
			sub(a,b);
			break;
		}
		case 3:
		{
			mul(a,b);
			break;
		}
		case 4:
		{
			div(a, b);
			break;
		} 
		case 5:
		{
			mod(a,b);
			break;
		} 
		case 6:
		{
			dis(a, b);
		}
		}
		
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void div(int a, int b) {
		System.out.println(a/b);
	}
	public static void mod(int a, int b) {
		System.out.println(a%b);
	}
	public static void dis(int a, int b) {
		System.out.println(a-((a/100)*b));
	}
}

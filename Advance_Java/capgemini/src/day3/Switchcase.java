package day3;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number between 1 to 4");
//		int n = sc.nextInt();
//		switch(n) {
//		case 1:
//		{
//			System.out.println("You entered 1");
//			break;
//		}
//		case 2:
//		{
//			System.out.println("You entered 2");
//		}
//		break;
//		case 3:
//		{
//			System.out.println("You entered 3");
//		}
//		break;
//		case 4:
//		{
//			System.out.println("You entered 4");
//			break;
//		}
//		default:
//		{
//			System.out.println("read the question properly");
//		}
//		}
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for Division\nEnter 5 for modules");
		int n = sc.nextInt();
		switch(n) {
		case 1:
		{
			System.out.println(a+b);
			break;
		}
		case 2:
		{
			System.out.println(a-b);
			break;
		}
		case 3:
		{
			System.out.println(a*b);
			break;
		}
		case 4:
		{
			System.out.println(a/b);
			break;
		} 
		case 5:
		{
			System.out.println(a%b);
			break;
		} 
		default:
		{
			System.out.println("Only numbers from 1 to 4");
		}
		}
	}
}
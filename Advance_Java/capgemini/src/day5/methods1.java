package day5;
import java.util.Scanner;
public class methods1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//polynomial
		
		squarearea(5);
		rectanglearea(5, 6);
		circlearea(7);
		trianglearea(2, 4);
	}
	static void squarearea(int a) {
		System.out.println(a*a);
	}
	static void rectanglearea(int a, int b) {
		System.out.println(a*b);
	}
	static void circlearea(double a) {
		System.out.println((Math.PI)*a*a);
	}
	static void trianglearea(int a, int b) {
		System.out.println((0.5)*a*b);
	}
	
}

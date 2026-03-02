package day4;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b) {
			System.out.println("It is a square");
		} else {
			System.out.println("It is a rectangle");
		}
		System.out.println("\nGreater in a and b");
		String x = (a > b) ? "A is greater" : "B is greater";
		System.out.println(x);
	}

}

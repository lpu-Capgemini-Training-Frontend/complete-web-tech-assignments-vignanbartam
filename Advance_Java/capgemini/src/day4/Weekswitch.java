package day4;
import java.util.Scanner;
public class Weekswitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine().toLowerCase();
		switch(day) {
			case "monday":
				System.out.println("eat biryani");
				break;
			case "tuesday":
				System.out.println("eat burger");
				break;
			case "wednesday":
				System.out.println("eat samosa");
				break;
			case "thursday":
				System.out.println("eat pizza");
				break;
			case "friday":
				System.out.println("eat momo");
				break;
			case "saturday":
				System.out.println("eat bread pakoda");
				break;
			case "sunday":
				System.out.println("eat chowmin");
				break;
		}
	}
}

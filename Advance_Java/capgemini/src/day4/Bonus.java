package day4;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your salary");
		int salary = sc.nextInt();
		System.out.println("Your service");
		int service = sc.nextInt();
		System.out.println("Your salary after bonus");
		if(service > 5) {
			System.out.println(salary + ( (salary/100) * 5));
		} else {
			System.out.println(salary);
		}
	}

}

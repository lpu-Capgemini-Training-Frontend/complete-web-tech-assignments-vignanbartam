package day4;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("No of T-shirts you have taken");
		int ts = sc.nextInt();
		System.out.println("Your bill");
		if(ts >= 5) {
			System.out.println((ts*200) - ((ts*200)/10));
		} else {
			System.out.println(ts*200);
		}
	}
}

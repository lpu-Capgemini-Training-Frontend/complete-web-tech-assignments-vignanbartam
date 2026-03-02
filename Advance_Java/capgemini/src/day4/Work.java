package day4;
import java.util.Scanner;
public class Work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your sex(M/F)");
		String s = sc.nextLine().toLowerCase();
		char sex = s.charAt(0);
		System.out.println("Your marital status(y-yes/ n-no)");
		String n = sc.nextLine().toLowerCase();
		char ms = n.charAt(0);
		if(sex == 'm') {
			if(age > 20 && age<=40) {
				System.out.println("Can work anywhere");
			} else if(age >40 && age <=60) {
				System.out.println("can work only in urban area");
			} else {
				System.out.println("ERROR");
			}
		} else if(sex == 'f') {
			System.out.println("can work only in urban area");
		}
	}
}

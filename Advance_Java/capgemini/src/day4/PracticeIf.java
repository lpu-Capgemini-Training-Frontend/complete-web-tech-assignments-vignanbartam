package day4;
import java.util.Scanner;
public class PracticeIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>16) System.out.println("he can ride scooty");
		if(age>18) System.out.println("he can ride bike");
		if(age>20) System.out.println("he can ride car");
	}
}

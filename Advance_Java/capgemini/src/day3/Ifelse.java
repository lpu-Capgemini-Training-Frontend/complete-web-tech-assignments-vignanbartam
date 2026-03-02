package day3;
import java.util.*;

public class Ifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("------------Nested else-----------");
//		System.out.println("Enter age : ");
//		int age = sc.nextInt();
//		System.out.println("Enter weight : ");
//		int weight = sc.nextInt();
//		System.out.println("Enter BloodU : ");
//		int blood = sc.nextInt();
//		if(age >= 18) {
//			if(weight > 45) {
//				if(blood > 9) {
//					System.out.println("You can donate the blood");
//				} else {
//					System.out.println("No blood found, eat beat root twice a day");
//				}
//			} else {
//				System.out.println("UW, Drink banana shake twice a day");
//			}
//		} else {
//			System.out.println("UA, pahle bade ho jao beta");
//		}
		System.out.println("Enter your Degree");
		String d = sc.nextLine();
		System.out.println("Enter your Stream");
		String s = sc.nextLine();
		System.out.println("Enter your Knowledge");
		String k = sc.nextLine();
		if(d.equals("Btech")) {
			if(s.equals("IT")) {
				if(k.equals("Java")) {
					System.out.println("Congrats, you got a job");
				} else {
					System.out.println("Learn java");
				}
			} else {
				System.out.println("Only IT students");
			}
		}else {
			System.out.println("Only Btech Students");
		}
	}
}
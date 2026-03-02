package day4;
import java.util.Scanner;
public class OldYoungUppercaseLowercase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter 3 numbers");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int max=c, min=c;
//		if(a>b && a>c) {
//			max=a;
//		} else if(b>a && b>c) {
//			max=b;
//		}
//		if(a<b && a<c) {
//			min=a;
//		} else if(b<c && b<a) {
//			min=b;
//		}
//		System.out.println("max" + max + "\nmin " + min);
		System.out.println("Enter a character");
		String a = sc.next();
		char ch = a.charAt(0);
		String r = (ch>=65 && ch<=90) ? "Upper Case" : (ch>=97 && ch <= 122) ? "Lower Case" : "Not a Alphabet";
		System.out.println(r);
	}
}

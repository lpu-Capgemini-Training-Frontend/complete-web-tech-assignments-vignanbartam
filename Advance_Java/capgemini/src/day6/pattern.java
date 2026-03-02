package day6;
import java.util.Scanner;
public class pattern {
	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-------------------");
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-------------------");
//		for(int i=5; i>=1; i--) {
//			for(int j=5; j>=1; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-------------------");
//		for(int i=5; i>=1; i--) {
//			for(int j=5; j>=1; j--) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//		int a = 1;
//		System.out.println("-------------------");
//		for(int i=5; i>=1; i--) {
//			for(int j=5; j>=1; j--) {
//				System.out.print(a + " ");
//				a++;
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------");
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print((i*5)-(5-j) + " ");
//			}
//			System.out.println();
//		}
//		
//		int a1 = 1;
//		System.out.println("-------------------");
//		for(int i=5; i>=1; i--) {
//			for(int j=5; j>=1; j--) {
//				if(a1>9) a1=1;
//				System.out.print(a1 + " ");
//				a1++;
//			}
//			System.out.println();
//		}
		
		//alphabets;
//		for(int i=1; i<=5; i++) {
//			for(int j = 65; j<=69 ; j++) {
//				System.out.print((char)(j));
//			}
//			System.out.println();
//		}
//		
//		for(int j = 65; j<=69 ; j++) {
//			for(int i=1; i<=5; i++) {
//				System.out.print((char)(j));
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j = 90; j>=86 ; j--) {
//				System.out.print((char)(j));
//			}
//			System.out.println();
//		}
//		
//		for(int j = 90; j>=86 ; j--) {
//			for(int i=1; i<=5; i++) {
//				System.out.print((char)(j));
//			}
//			System.out.println();
//		}
		
//		char ch = 'A';
//		for(int i=1; i<=5; i++) {
//			for(int j = 90; j>=86 ; j--) {
//				System.out.print(ch++ + " ");
//			}
//			System.out.println();
//		}
//		
//		int a = 1;
//		for(int i=1; i<=5; i++) {
//			for(int j = 90; j>=86 ; j--) {
//				if(a>1) a=0;
//				System.out.print(a + " ");
//				a++;
//			}
//			System.out.println();
//		}
		
//		int temp = 1;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(temp);
//				temp ^= 1;
//			}
//			System.out.println();
//		}
		
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			System.out.print("* " );
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//			} else {
//				j++;
//			}
//		}
//		
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			System.out.print(6-j + " " );
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//			} else {
//				j++;
//			}
//		}
//		
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			System.out.print(j + " " );
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//			} else {
//				j++;
//			}
//		}
//		
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			char ch = 'A';
//			System.out.print((char)(ch+j-1) + " " );
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//			} else {
//				j++;
//			}
//		}
//		
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			char ch = 'Z';
//			System.out.print((char)(ch-j+1) + " " );
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//			} else {
//				j++;
//			}
//		}
//		
//		char ch = 'l';
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			System.out.print(ch++ + " " );
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//			} else {
//				j++;
//			}
//		}
//		int temp = 1;
//		for(int i=1,j=1; i<=5 && j<=i ; ) {
//			System.out.print(temp + " " );
//			temp ^= 1;
//			if(i==j) {
//				i++;
//				System.out.println();
//				j=1;
//				temp=1;
//			} else {
//				j++;
//			}
//		}
//		for(int i=1,j=5; i<=5 && j>=1 ; ) {
//			System.out.print(j + " " );
//			if(i==j) {
//				i--;
//				System.out.println();
//				j=5;
//			} else {
//				j--;
//			}
//		}

		
		for(int j=1; j<=5; j++) {
			for(int i=5; i>=1; i--) {
				if(j>=i)
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

package day5;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		
		//divisible by 7 or ends with 7 displayed and count of the number
		
//		int a = 1;
//		int count=0;
//		while(a <= 1000) {
//		if(a%7==0 || a%10==7) {
//			System.out.print(a + " ");
//			count++;
//		}
//		a++;
//		}
//		System.out.println("\n" + count);
//	}
//		        int count = 100/7;
//		        System.out.println(count);
//		        int count1 = 100/10;
//		        System.out.println(count1);    
//
//		        int ans=1, i=1;
//		        int count2=0;
//		        while(ans<=100){
//		            ans = 7*i;
//		            i+=10;
//		            if(ans<=100){
//		                count2++;
//		            }
//		        }
//
//		        System.out.println(count+count1-count2);
		
		
		
		
		//factorial of a number with count
		
//		int a = sc.nextInt();
//		int x = 1;
//		int re = 0;
//		while(x < a) {
//			if(a % x == 0) {
//				System.out.print(x + " ");
//				re++;
//			}
//			x++;
//		}
//		System.out.println("\nCount: " + re);
		
		
		//fibonacci series
//		
//		int a = sc.nextInt();
//		int x=0; int y=1;
//		System.out.println("Fibonacci series of " + a + " :");
//		while(a>0) {
//			System.out.print(x+" ");
//			int temp = x+y;
//			x = y;
//			y = temp;
//			a--;
		
		//sum of square of natural numbers
		
//		int a = 100;
//		int sum=0;
//		while(a>0) {
//			sum += a*a;
//			a--;
//		}
//		System.out.println(sum);
//		
		
		// sum of squares of even numbers upto 100
		int a = 100;
		int sum=0;
		while(a>0) {
			sum += a*a;
			a=a-2;
		}
		System.out.println(sum);
		
		
		//
	}
}

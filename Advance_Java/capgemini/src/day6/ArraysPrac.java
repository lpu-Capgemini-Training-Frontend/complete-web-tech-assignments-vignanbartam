package day6;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArraysPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] a = {1, 2, 3, 4, 5};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		
//		
//		int[] arr = new int[5];
//		for(int i=0; i<5; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		//number palindrome in array
//		System.out.println("Enter the length of Array");
//		int x = sc.nextInt();
//		int[] a = new int[x];
//		System.out.println("Enter the values to be entered in array");
//		for(int i=0; i<a.length; i++) {
//			a[i] = sc.nextInt();
//		}
//		System.out.println("From above palindrome are : ");
//		for(int i=0; i<x; i++) {
//			palindrome(a[i]);
//		}
//	}
//	static void palindrome(int x) {
//		int rev=0;
//		int x1 = x;
//		while(x>0) {
//			int l = x%10;
//			rev = rev*10+l;
//			x/=10;
//		}
//		if(x1 == rev) System.out.print(x1 + " ");
		
		
		// 2 arrays identical or not
//		System.out.println("Enter the length of 1st array");
//		int x = sc.nextInt();
//		System.out.println("values of 1st array");
//		int[] a = new int[x];
//		for(int i=0; i<x; i++) {
//			a[i] = sc.nextInt();
//		}
//		System.out.println("Enter the length of 2nd array");
//		int y = sc.nextInt();
//
//		System.out.println("values of 2nd array");
//		int[] b = new int[y];
//		for(int i=0; i<y; i++) {
//			b[i] = sc.nextInt();
//		}
//		boolean res = true;
//		if(x == y) {
//			for(int i=0; i<x; i++) {
//				if(a[i] != b[i]) res=false;
//				break;
//			}
//		} else {
//			res=false;
//		}
//		if(res) System.out.println("identical");
//		else System.out.println("not identical");

		
		
		//
		int a = sc.nextInt();
		char[] arr = new char[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.next().charAt(0);
		}
		int b = a/2;
		int re = a-1;
		boolean res = true;
		for(int i=0; i<b; i++) {
			if(arr[i] != arr[re--])	res=false;
			break;
		}
		if(res) System.out.println("array is palindrome");
		else System.out.println("array is not palindrome");
	}

}

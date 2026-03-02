package day7;
import java.util.Scanner;
public class Bankdetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Bank b = new Bank(2356478, "Rishith", "SBIN0006222"+ "", 5500, 3546);
//		b.getDeatails();
//		b.setbalance(45000);
//		b.setAhn("Rishith Kumar");
//		System.out.println("\n--------------After editing-------------\n");
//		b.getDeatails();
//		
		System.out.println("Enter account number");
		int acc = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account holder name");
		String ahn = sc.nextLine();
		System.out.println("Enter IFSC number");
		String ifsc = sc.nextLine();
		System.out.println("Enter micr");
		int micr = sc.nextInt();
		
		Bank b = new Bank(acc, ahn, ifsc, micr);
		b.getDeatails();
		b.setbalance(45000);
		b.setAhn("Rishith Kumar");
		System.out.println("\n--------------After editing-------------\n");
		b.getDeatails();
		
		
	}
}
 
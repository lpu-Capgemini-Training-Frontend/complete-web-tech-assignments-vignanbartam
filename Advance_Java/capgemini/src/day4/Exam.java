package day4;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of classes held");
		int held=sc.nextInt();
		System.out.println("No of classes attended");
		int atd = sc.nextInt();
		float per = (atd/held)*100;
		if(per<75) {
			System.out.println("cannot attend exams");
		} else {
			System.out.println("can Attend exams");
		}
	}

}

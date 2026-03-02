package day5;
import java.util.*;
public class notebook {
	int a;
	int b;
	notebook(int a, int b){
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println("no of pages " + a);
		System.out.println("price " + b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		notebook nb = new notebook(a, b);
		notebook nb1 = new notebook(1245, 600);
		nb.display();
		nb1.display();
	}

}

package day7;

public class dhool {
	public static void main(String[] args) {
		int a = 1;
		int b = 9;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(j<=a || j>=b) {
					System.out.print(" *");
				}
				else System.out.print("  ");
			}
			a++;
			b--;
			System.out.println();
		}
		a = 5;
		b = 5;

		for(int i=1; i<=5; i++) {
		    for(int j=1; j<=9; j++) {
		        if(j < a || j > b) {
		            System.out.print(" *");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    a--;
		    b++;
		    System.out.println();
		}

	}
}

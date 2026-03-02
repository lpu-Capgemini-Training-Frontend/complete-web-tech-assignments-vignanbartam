package day7;

public class rhombuspatter {
	public static void main(String[] args) {
		int a = 4;
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				if(j == a) {
					System.out.print("* ");
					a--;
				}
				else System.out.print("  ");
			}
			for(int k=2; k<5; k++) {
				if(i==k) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		a = 3;
		for(int i=1; i<5; i++) {
			for(int k=1; k<4; k++) {
				if(k == i+1) System.out.print("* ");
				else System.out.print("  ");
			}
			for(int j=1; j<4; j++) {
				if(j == a) {
					System.out.print("* ");
					a--;
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}

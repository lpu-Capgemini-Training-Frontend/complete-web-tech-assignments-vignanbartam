package day7;

public class patterns {
	public static void main(String[] args) {
		int a=1;
		int b=1;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(j <= 5-i) System.out.print("  ");
//				else {
//					System.out.print(a+" ");
//					a^=1;
//				}
//			}
//			for(int k=i-1; k>=1; k--) {
//				System.out.print(a + " ");
//				a^=1;
//			}
//			System.out.println();
//			a=1;
//		}
//		int a=5;
//		for(int i=5; i>=0; i--) {
//			for(int j=5; j>=1; j--) {uujjjjj
//				if(j >= 6-i) System.out.print("  ");
//				else {
//					System.out.print(a+" ");
//					a--;
//				}
//			}
//			System.out.println();
//			a=5;
//		}
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(j >= i) System.out.print(j+" ");
//				else System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j <= 5-i) System.out.print("  ");
				else {
					System.out.print(a+" ");
					a^=1;
				}
			}
			for(int k=i-1; k>=1; k--) {
				System.out.print(a + " ");
				a^=1;
			}
			System.out.println();
			a=1;
		}
	}
}

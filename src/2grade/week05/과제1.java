package week05;

public class °úÁ¦1 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2 + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 4-i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= i*2-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
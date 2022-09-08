package week04;

public class Ex6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				 if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				 for (int m = 1; m <= 5; m--) {
					 System.out.print(" ");
				 }
			}
			System.out.println();
		}
	}
}

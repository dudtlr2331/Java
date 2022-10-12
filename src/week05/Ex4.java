package week05;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("열방향 표시할 단 개수?");
		int cols = in.nextInt();
		for (int i = 2; i <= 9; i += cols) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < cols && i + k <= 9; k++)
					System.out.printf("%2d*%2d=%3d\t", i + k, j, (i + k) * j);
				System.out.println();
			}
			System.out.println();
		}
		in.close();
	}
}

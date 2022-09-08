package week04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int max = 0;
		int min = 0;

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("정수의 값 : ");
			int x = in.nextInt();

			if (i == 0) {
				max = min = x;
				continue;
			}

			if (x > max)
				max = x;
			else if (x < min)
				min = x;
		}

		System.out.println("max : " + max + " min : " + min);
	}
}

package week10;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("환전하실 금액을 입력해 주세요 (0 입력 시 종료) >> ");
			int amount = sc.nextInt();
			
			if (amount == 0) {
				System.out.println("종료합니다.");
				break;
			}

			int[] base = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

			for (int n : base) {
				if (amount / n != 0)
					System.out.println(n + "원권 " + amount / n + "개");
				amount %= n;
			}
		}
	}
}

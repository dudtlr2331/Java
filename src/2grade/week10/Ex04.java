package week10;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 금액을 입력 받습니다
		System.out.print("금액 입력 : ");
		int amount = sc.nextInt();

		// 화폐 단위 배열을 만듭니다
		int[] base = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		// 각 화폐 단위 반복
		for (int n : base) {
			// 만약 현재 화폐단위가 0 이 아니면
			if (amount / n != 0)
				// 출력합니다
				System.out.println(n + "원권 " + amount / n + "개");
			// 다음 화폐 단위 준비
			amount %= n;
		}
	}
}

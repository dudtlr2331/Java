package week10;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ȯ���Ͻ� �ݾ��� �Է��� �ּ��� (0 �Է� �� ����) >> ");
			int amount = sc.nextInt();
			
			if (amount == 0) {
				System.out.println("�����մϴ�.");
				break;
			}

			int[] base = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

			for (int n : base) {
				if (amount / n != 0)
					System.out.println(n + "���� " + amount / n + "��");
				amount %= n;
			}
		}
	}
}

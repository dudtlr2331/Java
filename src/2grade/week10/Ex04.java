package week10;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �ݾ��� �Է� �޽��ϴ�
		System.out.print("�ݾ� �Է� : ");
		int amount = sc.nextInt();

		// ȭ�� ���� �迭�� ����ϴ�
		int[] base = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		// �� ȭ�� ���� �ݺ�
		for (int n : base) {
			// ���� ���� ȭ������� 0 �� �ƴϸ�
			if (amount / n != 0)
				// ����մϴ�
				System.out.println(n + "���� " + amount / n + "��");
			// ���� ȭ�� ���� �غ�
			amount %= n;
		}
	}
}

package week05;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("o, e �� �ϳ��� ���ڸ� �Է����ּ��� : ");
		
		char ch = sc.next().charAt(0);
		int sumNum = 0;

		if (ch == 'o') {
			for (int i = 1; i <= 100; i += 2) {
				sumNum += i;
				if (sumNum > 101) {
					System.out.println("Ȧ���� ���� 101�� ���ʷ� �Ѵ� Ȧ���� " + i + "�Դϴ�.");
					break;
				}
			}

		} else if (ch == 'e') {
			for (int i = 0; i <= 100; i += 2) {
				sumNum += i;
				if (sumNum > 100) {
					System.out.println("¦���� ���� 100�� ���ʷ� �Ѵ� ¦���� " + i + "�Դϴ�.");
					break;
				}
			}

		}
	}
}

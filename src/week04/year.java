package week04;

import java.util.Scanner;

public class year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ������ �ƴմϴ�.");
		}

		sc.close();
	}
}

package week05;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		char x = sc.next().charAt(0);

		if (x >= 'A' && x <= 'Z')
			System.out.println("�Էµ� ���ڴ� �빮���Դϴ�.");
		else if (x >= 'a' && x <= 'z')
			System.out.println("�Էµ� ���ڴ� �ҹ����Դϴ�.");
		else
			System.out.println("�ٽ� �Է����ּ���");
	}

}

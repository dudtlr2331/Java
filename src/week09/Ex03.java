package week09;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operator, num1, num2;

		System.out.print("������ ����(1: +, 2: -, 3: *, 4: /) ���� �Է� : ");
		operator = sc.nextInt();

		System.out.print("ù��° ���� : ");
		num1 = sc.nextInt();

		System.out.print("�ι�° ���� : ");
		num2 = sc.nextInt();
		
		System.out.println("����� : " + calculator(operator, num1, num2));
	}

	public static int calculator(int operator, int num1, int num2) {
		int result = 0;
		
		if (operator == 1) {
			result = num1 + num2;
		} else if (operator == 2) {
			result = num1 - num2;
		} else if (operator == 3) {
			result = num1 * num2;
		} else if (operator == 4) {
			result = num1 / num2;
		}
		
		return result;
	}
}

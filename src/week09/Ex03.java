package week09;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operator, num1, num2;

		System.out.print("연산자 종류(1: +, 2: -, 3: *, 4: /) 정수 입력 : ");
		operator = sc.nextInt();

		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
		System.out.println("계산결과 : " + calculator(operator, num1, num2));
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

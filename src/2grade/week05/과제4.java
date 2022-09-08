package week05;

import java.util.Scanner;

public class 과제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("o, e 중 하나의 문자를 입력해주세요 : ");
		
		char ch = sc.next().charAt(0);
		int sumNum = 0;

		if (ch == 'o') {
			for (int i = 1; i <= 100; i += 2) {
				sumNum += i;
				if (sumNum > 101) {
					System.out.println("홀수의 합이 101을 최초로 넘는 홀수는 " + i + "입니다.");
					break;
				}
			}

		} else if (ch == 'e') {
			for (int i = 0; i <= 100; i += 2) {
				sumNum += i;
				if (sumNum > 100) {
					System.out.println("짝수의 합이 100을 최초로 넘는 짝수는 " + i + "입니다.");
					break;
				}
			}

		}
	}
}

package week04;

import java.util.Scanner;

public class year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수형의 년도를 입력하세요 : ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}

		sc.close();
	}
}

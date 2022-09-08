package week05;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자을 입력해주세요 : ");
		char x = sc.next().charAt(0);

		if (x >= 'A' && x <= 'Z')
			System.out.println("입력된 문자는 대문자입니다.");
		else if (x >= 'a' && x <= 'z')
			System.out.println("입력된 문자는 소문자입니다.");
		else
			System.out.println("다시 입력해주세요");
	}

}

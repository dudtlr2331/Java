package week07;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		String strNum;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 여러 개 입력 : ");
		strNum = sc.next();
		
		for(int i = 0; i < strNum.length(); i++) {
			int num = (int)strNum.charAt(i) - 48;

			int a = 1;
			while(a <= num) {
				System.out.print("*");
				a++;
			}
			System.out.println("");
		}
	}
}

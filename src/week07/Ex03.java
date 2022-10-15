package week07;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String strNum;
		int len;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 여러 개 입력 : ");
		strNum = sc.next();
		
		len = strNum.length();
		
		for(int i = 0; i < len; i++) {
			char c = strNum.charAt(i);
			int num = (int)c - 48;

			int a = 1;
			while(a <= num) {
				System.out.print("*");
				a++;
			}
			System.out.println("");
		}
	}
}

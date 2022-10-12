package week05;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("글자를 입력 :  ");
		String str = sc.nextLine();
		
		char c;
		int len = str.length( );

		System.out.println("입력한 문자열 ==> " + str);
		System.out.print("변환된 문자열 ==> ");
		
		for (int i=(len-1); i>=0; i--) {
			c = str.charAt(i);
			System.out.printf("%c", c);
		}
	}
}

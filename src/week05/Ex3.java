package week05;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� :  ");
		String str = sc.nextLine();
		
		char c;
		int len = str.length( );

		System.out.println("�Է��� ���ڿ� ==> " + str);
		System.out.print("��ȯ�� ���ڿ� ==> ");
		
		for (int i=(len-1); i>=0; i--) {
			c = str.charAt(i);
			System.out.printf("%c", c);
		}
	}
}

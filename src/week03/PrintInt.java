package week03;

import java.util.Scanner;

public class PrintInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("������ �Է��ϼ��� ==> ");
		a = sc.nextInt();
		System.out.printf("10���� ==> %d \n", a);
		System.out.printf("16���� ==> %x \n", a);
		System.out.printf("8���� ==> %o  \n", a);
		
		sc.close();
	}
}

package week03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("ù��° ����� ���� �Է����ּ���==> ");
		a = sc.nextInt();
		System.out.print("�ι�° ����� ���� �Է����ּ���==> ");
		b = sc.nextInt();
		
		System.out.printf("%d+%d=%d \n", a, b, a+b);
		System.out.printf("%d-%d=%d \n", a, b, a-b);
		System.out.printf("%d*%d=%d \n", a, b, a*b);
		System.out.printf("%d/%d=%d \n", a, b, a/b);
		
		sc.close();
	}

}

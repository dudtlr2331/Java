package week03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("첫번째 계산할 값을 입력해주세요==> ");
		a = sc.nextInt();
		System.out.print("두번째 계산할 값을 입력해주세요==> ");
		b = sc.nextInt();
		
		System.out.printf("%d+%d=%d \n", a, b, a+b);
		System.out.printf("%d-%d=%d \n", a, b, a-b);
		System.out.printf("%d*%d=%d \n", a, b, a*b);
		System.out.printf("%d/%d=%d \n", a, b, a/b);
		
		sc.close();
	}

}

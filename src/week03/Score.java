package week03;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���м��� : ");
		int math = sc.nextInt();
		System.out.print("����� : ");
		int eng = sc.nextInt();
		System.out.print("���м��� : ");
		int scien = sc.nextInt();
		
		double average = (math + eng + scien) / 3.0;
		
		System.out.printf("���� : %d \t ���� : %d \t ���� : %d \n", math, eng, scien);
		System.out.printf("��� : %5.2f", average);
	}
}

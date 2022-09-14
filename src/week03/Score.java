package week03;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수학성적 : ");
		int math = sc.nextInt();
		System.out.print("영어성적 : ");
		int eng = sc.nextInt();
		System.out.print("과학성적 : ");
		int scien = sc.nextInt();
		
		double average = (math + eng + scien) / 3.0;
		
		System.out.printf("수학 : %d \t 영어 : %d \t 과학 : %d \n", math, eng, scien);
		System.out.printf("평균 : %5.2f", average);
	}
}

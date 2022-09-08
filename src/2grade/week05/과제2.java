package week05;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 10까지 중 1개의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9: System.out.println("홀수입니다."); break;
		
		case 2:
		case 4:
		case 6:
		case 8:
		case 10: System.out.println("짝수입니다."); break;
		
		default: System.out.println("1 ~ 10까지 정수만 입력하세요.");
		}			
	}
}

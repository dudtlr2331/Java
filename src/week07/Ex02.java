package week07;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;

//		while (true) {
//			System.out.print("����? ");
//			num = sc.nextInt();
//
//			if (num == 0) break;
//
//			for (int i = 1; i <= num; i++)
//				sum += i;
//
//			System.out.printf("1���� %d������ �� : %d\n", num, sum);
//			sum = 0;
//		}
		System.out.print("����? ");
		num = sc.nextInt();
		
		while (num != 0) {
			for (int i = 1; i <= num; i++)
				sum += i;
			System.out.printf("1���� %d������ �� : %d\n", num, sum);
			
			sum = 0;
			
			System.out.print("����? ");
			num = sc.nextInt();
		}		
		System.out.println("���α׷� ����~");
		sc.close();
	}
}

package week05;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 10���� �� 1���� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9: System.out.println("Ȧ���Դϴ�."); break;
		
		case 2:
		case 4:
		case 6:
		case 8:
		case 10: System.out.println("¦���Դϴ�."); break;
		
		default: System.out.println("1 ~ 10���� ������ �Է��ϼ���.");
		}			
	}
}

package week03;

import java.util.Scanner;

public class Switch1Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����� �Է��ϼ��� : ");
		int rank = in.nextInt();
		
		System.out.println("==========================");
	
		if(rank == 1)
			System.out.println("�ϵ��Դϴ�.");
		else if(rank == 2)
			System.out.println("�̵��Դϴ�.");
		else if(rank == 3)
			System.out.println("����Դϴ�.");
		else
			System.out.println("����Դϴ�.");
			
		
//		switch (rank) {
//		case 1:
//			System.out.println("�ϵ��Դϴ�.");
//			break;
//		case 2:
//			System.out.println("�̵��Դϴ�.");
//			break;
//		case 3:
//			System.out.println("����Դϴ�.");
//			break;
//		default:
//			System.out.println("����Դϴ�.");
//		}
			
	}

}

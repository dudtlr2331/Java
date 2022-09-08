package week03;

import java.util.Scanner;

public class Switch1Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("등수를 입력하세요 : ");
		int rank = in.nextInt();
		
		System.out.println("==========================");
	
		if(rank == 1)
			System.out.println("일등입니다.");
		else if(rank == 2)
			System.out.println("이등입니다.");
		else if(rank == 3)
			System.out.println("삼등입니다.");
		else
			System.out.println("등외입니다.");
			
		
//		switch (rank) {
//		case 1:
//			System.out.println("일등입니다.");
//			break;
//		case 2:
//			System.out.println("이등입니다.");
//			break;
//		case 3:
//			System.out.println("삼등입니다.");
//			break;
//		default:
//			System.out.println("등외입니다.");
//		}
			
	}

}

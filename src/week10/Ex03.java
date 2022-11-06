package week10;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 *  > 처리조건
		 *	- 입력 : 3명 학생에 대해 학생별로4과목 점수를 키보드로 입력받음 (점수는 정수형으로 처리할 것)
		 *	- 출력 :학생별 평균과 학생전체 평균
		 *	- 반드시 2차원배열을 활용하여 해결할 것
		 */
		Scanner sc = new Scanner(System.in);
		int [][] score = new int[3][4]; 
		int [] sum = new int[3];
		double [] avg = new double[3];
		String [] sub = {"국어", "수학", "사회", "과학"};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(i+1 + "번 학생의 " + sub[j] + "점수를 입력하세요 : ");
				score[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++)
				sum[i] += score[i][j];
			avg[i] = sum[i] / 4.0;
			System.out.println(i+1 + "번 학생의 평균은 " + avg[i] + "점 입니다.");
		}
		
		System.out.println("반 평균은 " + (avg[0] + avg[1] + avg[2]) / 3.0 + "점 입니다.");
	}
}

package week04;

import java.util.Scanner;

public class ScoreSwitch {
	public static void main(String[] args) { //성적으로 등급 구하기 하나는 if/else문으로 하나는 switch문으로
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.print("성적을 입력해주세요 : ");
		int score = sc.nextInt();

		switch (score/10) {
		case 10: grade = 'A'; break;
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
}

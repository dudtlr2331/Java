package week04;

import java.util.Scanner;

public class ScoreIf {
	public static void main(String[] args) { //성적으로 등급 구하기 하나는 if/else문으로 하나는 switch문으로
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.print("성적을 입력해주세요 : ");
		int score = sc.nextInt();

		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
}

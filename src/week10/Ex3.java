package week10;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = { "국어", "영어", "수학", "과학" };
		int[] score = { 95, 80, 87, 77 };
		
		while (true) {
			System.out.print("검색할 과목의 이름을 입력하세요 (exit 입력 시 종료) >> ");
			String word = sc.next();
			if (word.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}				
			int i;
			for (i=0; i<subject.length; i++) {
				if (word.equals(subject[i])) break;
			}
			if (i<subject.length) System.out.println(score[i] + "점 입니다.");
			else System.out.println("그런 과목은 없습니다.");
		}	
	}
}

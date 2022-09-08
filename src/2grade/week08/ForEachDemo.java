package week08;

import java.util.Scanner;

public class ForEachDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int [5];
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt();
		
		//배열의 index를 이용하여 참조할 경우 오류 발생 가능성이 높음
		//System.out.println(scores[5]);
		//ForEach문 기억하기 ★★★★★
		for(int s : scores)
			sum += s; 
		System.out.println("평균 = " + sum / scores.length);
	}
}
// 시험 범위 1차원 배열까지
// 4월 27일 9시 10분부터 12시까지
//인터넷 사용x usb 사용가능 - 모든 자료 참조 가능

//배열, 인자 전달 방법, 메서드 정의 방법, 문자열 선언 방법  단순한 문제 x
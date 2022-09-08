package week08;

import java.util.Scanner;

public class Array1Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//배열을 선언하기만하고 초기화하지 않을 경우
		//초기값은 0으로 설정
		int scores[] = new int[5];
		double sum = 0.0;
		
		//반복문에서 배열 항목을 참조하기 위해서 인덱스 번호를 상수/ 변수로 지정할 수 있다.
		for(int i = 0; i < scores.length; i++) {
			System.out.println(i+1+"번째 정수 입력 : ");
			scores[i] = in.nextInt();
		}
		for(int i = 0; i < scores.length; i++)
			sum += scores[i];
		
		System.out.println("평균 = " + sum / scores.length);
			
	}

}

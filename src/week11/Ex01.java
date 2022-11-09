package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 { //1. 가변크기 배열 ArrayList
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int sum = 0;
		
		System.out.print("정수 입력 : ");
		while((data = in.nextInt()) >= 0) {
			System.out.print("정수 입력 : ");
			scores.add(data);
		}
		
		for(int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		
		System.out.println("평균 = " + sum / scores.size());
	}
}

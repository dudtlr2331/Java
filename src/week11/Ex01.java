package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 { //1. ����ũ�� �迭 ArrayList
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int sum = 0;
		
		System.out.print("���� �Է� : ");
		while((data = in.nextInt()) >= 0) {
			System.out.print("���� �Է� : ");
			scores.add(data);
		}
		
		for(int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		
		System.out.println("��� = " + sum / scores.size());
	}
}

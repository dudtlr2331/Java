package week10;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = { "����", "����", "����", "����" };
		int[] score = { 95, 80, 87, 77 };
		
		while (true) {
			System.out.print("�˻��� ������ �̸��� �Է��ϼ��� (exit �Է� �� ����) >> ");
			String word = sc.next();
			if (word.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}				
			int i;
			for (i=0; i<subject.length; i++) {
				if (word.equals(subject[i])) break;
			}
			if (i<subject.length) System.out.println(score[i] + "�� �Դϴ�.");
			else System.out.println("�׷� ������ �����ϴ�.");
		}	
	}
}

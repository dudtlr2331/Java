package week04;

import java.util.Scanner;

public class ScoreSwitch {
	public static void main(String[] args) { //�������� ��� ���ϱ� �ϳ��� if/else������ �ϳ��� switch������
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.print("������ �Է����ּ��� : ");
		int score = sc.nextInt();

		switch (score/10) {
		case 10: grade = 'A'; break;
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		System.out.println("����� ������ " + grade + " �Դϴ�.");
	}
}

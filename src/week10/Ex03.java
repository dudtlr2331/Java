package week10;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 *  > ó������
		 *	- �Է� : 3�� �л��� ���� �л�����4���� ������ Ű����� �Է¹��� (������ ���������� ó���� ��)
		 *	- ��� :�л��� ��հ� �л���ü ���
		 *	- �ݵ�� 2�����迭�� Ȱ���Ͽ� �ذ��� ��
		 */
		Scanner sc = new Scanner(System.in);
		int [][] score = new int[3][4]; 
		int [] sum = new int[3];
		double [] avg = new double[3];
		String [] sub = {"����", "����", "��ȸ", "����"};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(i+1 + "�� �л��� " + sub[j] + "������ �Է��ϼ��� : ");
				score[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++)
				sum[i] += score[i][j];
			avg[i] = sum[i] / 4.0;
			System.out.println(i+1 + "�� �л��� ����� " + avg[i] + "�� �Դϴ�.");
		}
		
		System.out.println("�� ����� " + (avg[0] + avg[1] + avg[2]) / 3.0 + "�� �Դϴ�.");
	}
}

package week08;

import java.util.Scanner;

public class ForEachDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int [5];
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt();
		
		//�迭�� index�� �̿��Ͽ� ������ ��� ���� �߻� ���ɼ��� ����
		//System.out.println(scores[5]);
		//ForEach�� ����ϱ� �ڡڡڡڡ�
		for(int s : scores)
			sum += s; 
		System.out.println("��� = " + sum / scores.length);
	}
}
// ���� ���� 1���� �迭����
// 4�� 27�� 9�� 10�к��� 12�ñ���
//���ͳ� ���x usb ��밡�� - ��� �ڷ� ���� ����

//�迭, ���� ���� ���, �޼��� ���� ���, ���ڿ� ���� ���  �ܼ��� ���� x
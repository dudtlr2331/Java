package week08;

import java.util.Scanner;

public class Array1Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//�迭�� �����ϱ⸸�ϰ� �ʱ�ȭ���� ���� ���
		//�ʱⰪ�� 0���� ����
		int scores[] = new int[5];
		double sum = 0.0;
		
		//�ݺ������� �迭 �׸��� �����ϱ� ���ؼ� �ε��� ��ȣ�� ���/ ������ ������ �� �ִ�.
		for(int i = 0; i < scores.length; i++) {
			System.out.println(i+1+"��° ���� �Է� : ");
			scores[i] = in.nextInt();
		}
		for(int i = 0; i < scores.length; i++)
			sum += scores[i];
		
		System.out.println("��� = " + sum / scores.length);
			
	}

}

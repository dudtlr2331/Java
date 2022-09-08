package week06;

import java.util.Scanner;

public class PrimeTest {
	// �Ҽ��� 1���� ũ�鼭 1�� �ڽ� �ܿ��� ������ ���� ��
	Scanner in = new Scanner(System.in);

	int inputData(int loop) {
		System.out.println(loop + "��° ���� �Է� : ");
		return in.nextInt();
	}

	boolean isPraime(int x) {
		int temp;
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false; // �ڽſ��� ���� ������ ���� ���
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeTest pt = new PrimeTest();
		int num;
		for (int i = 0;; i++) {
			num = pt.inputData(i);
			if (num <= 0)
				break;
			if (pt.isPraime(num))
				System.out.println(num + "�� �Ҽ��Դϴ�.");
			else
				System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		}
		System.out.println("���α׷� ����!!!");
	}
}

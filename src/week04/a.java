package week04;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("## ����� �ʴ� ? "); //�ú��ʷ� �����ؼ� ���
		int s = sc.nextInt();
		
		if((s /60) == 0) {
			System.out.println(s + "�� �Դϴ�.");
		}
	}
}

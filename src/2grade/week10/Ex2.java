package week10;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] eng = { "student", "love", "java", "happy", "future" };
	String[] kor = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };
	while (true) {
		System.out.print("����ܾ �Է��ϼ���>>");
		String word = (String) sc.next();
		if (word.equals("exit")) {
			System.out.println("�����մϴ�.");
			break;
		}				
		int i;
		for (i=0; i<eng.length; i++) {
			if (word.equals(eng[i])) break;
		}
		if (i<eng.length) System.out.println(kor[i]);
		else System.out.println("�׷� �ܾ�� �����ϴ�.");
	}
	sc.close();			
	}
}

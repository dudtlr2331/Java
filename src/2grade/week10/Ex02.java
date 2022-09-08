package week10;

import java.util.Scanner;

class Dictionary{
	String[] eng = { "student", "good", "java", "bucheon", "university" };
	String[] kor = { "�л�", "����", "�ڹ�", "��õ", "����" };
	
	public void search(String word) {
		int i;
		for (i=0; i<kor.length; i++) {
			if (word.equals(kor[i])) break;
		}
		if (i<kor.length) System.out.println(eng[i]);
		else System.out.println("ã���ô� �ܾ�� �����ϴ�.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
			System.out.print("�˻��� �ܾ �Է��ϼ��� (exit �Է� �� ����) >> ");
			String word = sc.nextLine();
			
			if (word.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			d.search(word);
		}
	}
}

package week09;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ? ");
		int dan = sc.nextInt();
		
		if (gugudan(dan) == true)
			System.out.printf("%d�� ��� ����",dan);
		else 
			System.out.print("���� �Է� ����");
	}
	
	public static boolean gugudan(int dan) {
		if(dan < 1 || dan > 9) return false;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " +  dan*i);
		}
		return true;
	}
}

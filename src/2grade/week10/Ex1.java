package week10;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("����� ���ĺ��� �Է��ϼ��� (exit �Է� �� ����) >> ");
			String str = sc.nextLine();
			char a = str.charAt(0);
			
			if (str.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}

			for (char i = a; i >= 'a'; i--) {
				for (char j = 'a'; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
}

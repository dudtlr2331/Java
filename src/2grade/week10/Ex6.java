package week10;

import java.util.Scanner;

class Phone {
	private String name;
	private String phNum;
	
	public String getName() {
		return name;
	}
	
	public String getPhNum() {
		return phNum;
	}

	public Phone(String name, String phNum) {
		this.name = name;
		this.phNum = phNum;
	}
}

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone p[] = new Phone[3];
		
		for (int i = 0; i < p.length; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			String phNum = sc.nextLine();
			p[i] = new Phone(name, phNum);
		}
		
		while(true) {
			System.out.print("��ȣ�� �˻��� �̸��� �Է��ϼ��� (0 �Է� �� ����) >> ");
			String str = sc.nextLine();

			if(str.equals("0")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
			for (int i = 0; i < p.length; i++) {
				if (p[i].getName().equals(str)) {
					System.out.println(str + "���� ��ȣ�� " + p[i].getPhNum() + "�Դϴ�.");
				} else {
					System.out.println("�˻��Ͻ� �̸��� �����ϴ�.");
					break;
				}
			}
		}
		
		
	}
}

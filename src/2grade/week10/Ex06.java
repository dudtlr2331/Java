//package week10;
//
//import java.util.Scanner;
//
//class Phone {
//	String name;
//	String phNum;
//	
//	public Phone(String name, String phNum) {
//		this.name = name;
//		this.phNum = phNum;
//	}
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Phone p[] = new Phone[3];
//		
//		for (int i = 0; i < p.length; i++) {
//			System.out.print("�̸��� �Է��ϼ��� : ");
//			String name = sc.nextLine();
//			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
//			String phNum = sc.nextLine();
//			p[i] = new Phone(name, phNum);
//		}
//		
//		while(true) {
//			System.out.print("��ȣ�� �˻��� �̸��� �Է��ϼ��� (0 �Է� �� ����) : ");
//			String n = sc.nextLine();
//
//			if(n.equals("0")) {
//				System.out.println("����Ǿ����ϴ�.");
//				break;
//			}
//			
//			for (int i = 0; i < p.length; i++) {
//				if (p[i].name.equals(n)) {
//					System.out.println(n + "���� ��ȣ�� " + p[i].phNum + "�Դϴ�.");
//				}else if (p[i].name.equals(null)){
//					System.out.println("�˻��Ͻ� �̸��� �����ϴ�.");					
//				}
//			}
//		}
//		
//		
//	}
//}

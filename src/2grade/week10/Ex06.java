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
//			System.out.print("이름을 입력하세요 : ");
//			String name = sc.nextLine();
//			System.out.print("전화번호를 입력하세요 : ");
//			String phNum = sc.nextLine();
//			p[i] = new Phone(name, phNum);
//		}
//		
//		while(true) {
//			System.out.print("번호을 검색할 이름을 입력하세요 (0 입력 시 종료) : ");
//			String n = sc.nextLine();
//
//			if(n.equals("0")) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			
//			for (int i = 0; i < p.length; i++) {
//				if (p[i].name.equals(n)) {
//					System.out.println(n + "님의 번호는 " + p[i].phNum + "입니다.");
//				}else if (p[i].name.equals(null)){
//					System.out.println("검색하신 이름이 없습니다.");					
//				}
//			}
//		}
//		
//		
//	}
//}

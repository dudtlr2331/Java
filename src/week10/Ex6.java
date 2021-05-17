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
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			String phNum = sc.nextLine();
			p[i] = new Phone(name, phNum);
		}
		
		while(true) {
			System.out.print("번호을 검색할 이름을 입력하세요 (0 입력 시 종료) >> ");
			String str = sc.nextLine();

			if(str.equals("0")) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			for (int i = 0; i < p.length; i++) {
				if (p[i].getName().equals(str)) {
					System.out.println(str + "님의 번호는 " + p[i].getPhNum() + "입니다.");
				} else {
					System.out.println("검색하신 이름이 없습니다.");
					break;
				}
			}
		}
		
		
	}
}

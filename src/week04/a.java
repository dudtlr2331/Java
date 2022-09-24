package week04;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("## 계산할 초는 ? "); //시분초로 분할해서 출력
		int s = sc.nextInt();
		
		if((s /60) == 0) {
			System.out.println(s + "초 입니다.");
		}
	}
}

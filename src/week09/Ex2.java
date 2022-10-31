package week09;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 ? ");
		int dan = sc.nextInt();
		
		if (gugudan(dan) == true)
			System.out.printf("%d단 출력 성공",dan);
		else 
			System.out.print("정수 입력 오류");
	}
	
	public static boolean gugudan(int dan) {
		if(dan < 1 || dan > 9) return false;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " +  dan*i);
		}
		return true;
	}
}

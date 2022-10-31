package week09;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¸î ´Ü ? ");
		int dan = sc.nextInt();
		gugudan(dan);
	}
	
	public static void gugudan(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " +  dan*i);
		}
	}
}

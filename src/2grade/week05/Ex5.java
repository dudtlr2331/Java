package week05;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ex)5914�� �Է��� ��� �� �ٿ� ��ǥ�� 5��, 9��, 1��, 4���� ���");
		System.out.print("0~9���� ���ڸ� �Է��ϼ��� : ");
		int inputNum = sc.nextInt();
		
		String numStr = Integer.toString(inputNum);

		for (int i = 0; i < numStr.length(); i++) {
			switch (numStr.charAt(i)) {
			case '0': System.out.println(" "); break;
			case '1': System.out.println("*"); break;
			case '2': System.out.println("**"); break;
			case '3': System.out.println("***"); break;
			case '4': System.out.println("****"); break;
			case '5': System.out.println("*****"); break;
			case '6': System.out.println("******"); break;
			case '7': System.out.println("*******"); break;
			case '8': System.out.println("********"); break;
			case '9': System.out.println("*********"); break;
			}
		}
	}	
}
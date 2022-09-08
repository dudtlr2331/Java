package week05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class 과제5 {
	
	public static int maParseInt(String str) {
		int result = 0;
		try {
			result = Integer.parseInt(str);
			System.out.println(str + "를 입력하셨습니다.");
			for(int i=0; i < result; i++)
				System.out.print("*");
		}catch (NumberFormatException e) {
			System.out.println("숫자값을 입력해 주세요.");
			result = -999;
		}finally {
			return result;
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("값을 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.next();
		String[] spStr = inputStr.split("");
		int[] result = new int[spStr.length];
		for(int i=0; i<spStr.length; i++) {
			result[i] = maParseInt(spStr[i]);
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ex)5914를 입력할 경우 각 줄에 별표가 5개, 9개, 1개, 4개를 출력");
//		System.out.print("0~9까지 숫자를 입력하세요 : ");
//		int aInt = sc.nextInt();
//		
//		String aString = Integer.toString(aInt);
//
//		for (int i = 0; i < aString.length(); i++) {
//			char ch = aString.charAt(i);
//			switch (ch) {
//			case '1': System.out.println("*"); break;
//			case '2': System.out.println("**"); break;
//			case '3': System.out.println("***"); break;
//			case '4': System.out.println("****"); break;
//			case '5': System.out.println("*****"); break;
//			case '6': System.out.println("******"); break;
//			case '7': System.out.println("*******"); break;
//			case '8': System.out.println("********"); break;
//			case '9': System.out.println("*********"); break;
//			}
//		}
			

	}	
}

//package week05;
//
//import java.util.Scanner;
//
//public class Ex5 {
//	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ex)5914를 입력할 경우 각 줄에 별표가 5개, 9개, 1개, 4개를 출력");
//		System.out.print("0~9까지 숫자를 입력하세요 : ");
//		int aInt = sc.nextInt();
//		
//		String aString = Integer.toString(aInt);
//
//		for (int i = 0; i < aString.length(); i++) {
//			char ch = aString.charAt(i);
//			switch (ch) {
//			case '0': System.out.println("hi"); break;
//			case '1': System.out.println("*"); break;
//			case '2': System.out.println("**"); break;
//			case '3': System.out.println("***"); break;
//			case '4': System.out.println("****"); break;
//			case '5': System.out.println("*****"); break;
//			case '6': System.out.println("******"); break;
//			case '7': System.out.println("*******"); break;
//			case '8': System.out.println("********"); break;
//			case '9': System.out.println("*********"); break;
//			}
//		}
//	}	
//}

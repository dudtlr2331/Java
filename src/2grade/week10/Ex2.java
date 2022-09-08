package week10;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] eng = { "student", "love", "java", "happy", "future" };
	String[] kor = { "학생", "사랑", "자바", "행복한", "미래" };
	while (true) {
		System.out.print("영어단어를 입력하세요>>");
		String word = (String) sc.next();
		if (word.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}				
		int i;
		for (i=0; i<eng.length; i++) {
			if (word.equals(eng[i])) break;
		}
		if (i<eng.length) System.out.println(kor[i]);
		else System.out.println("그런 단어는 없습니다.");
	}
	sc.close();			
	}
}

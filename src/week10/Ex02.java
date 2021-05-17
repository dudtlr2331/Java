package week10;

import java.util.Scanner;

class Dictionary{
	String[] eng = { "student", "good", "java", "bucheon", "university" };
	String[] kor = { "학생", "좋은", "자바", "부천", "대학" };
	
	public void search(String word) {
		int i;
		for (i=0; i<kor.length; i++) {
			if (word.equals(kor[i])) break;
		}
		if (i<kor.length) System.out.println(eng[i]);
		else System.out.println("찾으시는 단어는 없습니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
			System.out.print("검색할 단어를 입력하세요 (exit 입력 시 종료) >> ");
			String word = sc.nextLine();
			
			if (word.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			d.search(word);
		}
	}
}

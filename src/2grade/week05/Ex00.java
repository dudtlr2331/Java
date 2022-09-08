package week05;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("o, e 중 하나의 문자를 입력해주세요 : ");
		char ch = sc.next().charAt(0);

		int sumNum = 0;
		int start = 0;
		
		if(ch == 'o')
			start = 2;
		else
			start = 1;
		
		
			for (int i = start; i <= 100; i += 2) {
				sumNum += i;
				if (sumNum > 101) {
					System.out.println("홀수의 합이 101을 최초로 넘는 홀수는 " + i + "입니다.");
					break;
				}else if (sumNum > 100) {
					System.out.println("짝수의 합이 100을 최초로 넘는 짝수는 " + i + "입니다.");
					break;
			}

		}
	}
}

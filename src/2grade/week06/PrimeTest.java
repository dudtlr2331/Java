package week06;

import java.util.Scanner;

public class PrimeTest {
	// 소수는 1보다 크면서 1과 자신 외에는 나누지 않은 수
	Scanner in = new Scanner(System.in);

	int inputData(int loop) {
		System.out.println(loop + "번째 정수 입력 : ");
		return in.nextInt();
	}

	boolean isPraime(int x) {
		int temp;
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false; // 자신외의 수와 나누어 지는 경우
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeTest pt = new PrimeTest();
		int num;
		for (int i = 0;; i++) {
			num = pt.inputData(i);
			if (num <= 0)
				break;
			if (pt.isPraime(num))
				System.out.println(num + "는 소수입니다.");
			else
				System.out.println(num + "는 소수가 아닙니다");
		}
		System.out.println("프로그램 종료!!!");
	}
}

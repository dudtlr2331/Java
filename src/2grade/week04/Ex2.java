package week04;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수의 값 : ");
		
		int x = in.nextInt();
		int start, sum = 0;
		
		if(x % 2 == 0)
			start = 2;
		else
			start = 1;
		
		for(; start <= x; start += 2)
				sum += start;
		
		System.out.println("정수의 합은 " + sum);
	}
}

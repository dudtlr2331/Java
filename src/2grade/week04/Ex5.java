package week04;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		for(; ; i++) {		
			sum += i * i;
			
			if(sum > 1000)
				break;
		}
		
//		while(true) {
//			sum += i * i;
//			
//			if(sum > 1000)
//				break;
//			i++;
//		}

		System.out.println("i : " + i + ", гу : " + sum);
	}
}

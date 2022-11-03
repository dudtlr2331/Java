package week10;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++)
			scores[i] = sc.nextInt();
		
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];
		
		System.out.println("ЦђБе = " + sum / 5.0);
		sc.close();
	}
}

package week07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, multiple, i;
		int sum = 0;
		
		System.out.print("�հ��� ���۰� ==> ");
		start = sc.nextInt();
		
		System.out.print("�հ��� ���� ==> ");
		end = sc.nextInt();

		System.out.print("���	==> ");
		multiple = sc.nextInt();
		
		i = start;
		while(i <= end) {
			if(i % multiple == 0)
				sum += i;
			i++;
		}
		
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d", start, end, multiple, sum);
		sc.close();
	}
}

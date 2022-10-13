package week07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, multiple, i;
		int sum = 0;
		
		System.out.print("합계의 시작값 ==> ");
		start = sc.nextInt();
		
		System.out.print("합계의 끝값 ==> ");
		end = sc.nextInt();

		System.out.print("배수	==> ");
		multiple = sc.nextInt();
		
		i = start;
		while(i <= end) {
			if(i % multiple == 0)
				sum += i;
			i++;
		}
		
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", start, end, multiple, sum);
		sc.close();
	}
}

package week04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int oddCount = 0; //Ȧ��
		int evenCount = 0; //¦��
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �� : ");
			int x = in.nextInt();
			
			if(x == 0)
				break;
			
			if(x % 2 == 0)
				evenCount++;
			else
				oddCount++;		
		}
		
		
		System.out.println("¦���� ������ " + evenCount + " Ȧ���� ������ " + oddCount);
	}
}

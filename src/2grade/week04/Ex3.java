package week04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int oddCount = 0; //È¦¼ö
		int evenCount = 0; //Â¦¼ö
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("Á¤¼öÀÇ °ª : ");
			int x = in.nextInt();
			
			if(x == 0)
				break;
			
			if(x % 2 == 0)
				evenCount++;
			else
				oddCount++;		
		}
		
		
		System.out.println("Â¦¼öÀÇ °¹¼ö´Â " + evenCount + " È¦¼öÀÇ °¹¼ö´Â " + oddCount);
	}
}

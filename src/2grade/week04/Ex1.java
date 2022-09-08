package week04;

public class Ex1 {
	public static void main(String[] args) {
		int oddSum = 0; //È¦¼ö
		int evenSum = 0; //Â¦¼ö
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		
		System.out.println("Â¦¼öÀÇ ÇÕÀº " + evenSum + "È¦¼öÀÇ ÇÕÀº " + oddSum);
	}
}

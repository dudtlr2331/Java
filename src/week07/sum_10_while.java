package week07;

public class sum_10_while {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.printf("1~10ÀÇ ÇÕ°è : %d\n", sum);
	}
}

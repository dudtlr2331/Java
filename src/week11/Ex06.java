package week11;

public class Ex06 {//6. 가변개수 인수
	public static void main(String[] args) {
		pringSum(1, 2, 3, 4, 5);
		pringSum(10, 20, 30);
	}
	
	public static void pringSum(int... v) {
		int sum = 0;
		for(int i : v)
			sum += i;
		System.out.println(sum);
	}
}

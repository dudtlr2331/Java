package week11;

public class IncrementDemo {

	public static void main(String[] args) {
		IncrementDemo inc = new IncrementDemo();
		int[] x = { 0 };
		int[][] y = {{0},{1}};
		System.out.println("호출 전의 x[0] = " + x[0]);
		inc.increment(x);
//		inc.increment(y);
		System.out.println("호출 후의 x[0] = " + x[0]);
	}
	
//	public void incremnet(int[][] n)
	public void increment(int[] n) {
		System.out.print("increment() 메서드 안에서 n[0] = " + n[0] + " ---> ");
		n[0]++;
		System.out.println("n[0] = " + n[0]);
	}

}

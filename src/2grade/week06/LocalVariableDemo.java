package week06;

public class LocalVariableDemo {
	public double d;

	public static void main(String[] args) {
		LocalVariableDemo local = new LocalVariableDemo();
		System.out.println(local.d);

		int b; // 지역변수를 초기화하지 않고 참조할 경우
//		System.out.println(b);
		{
			int c = 50;
			System.out.println("c = " + c);
		}
		// 지역변수의 참조 범위를 벗어남
//	System.out.println("c = " + c);
	}

}

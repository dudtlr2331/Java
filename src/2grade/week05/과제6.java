package week05;

public class 과제6 {
	public static void main(String[] args) {
		int x = 20;
//		64 32 16 8 4 2 1
//		 0  0  1 0 1 0 0
//		 0  0  0 0 1 0 1 
//		 1  0  1 0 0 0 0
		
//		System.out.println(x >> 2);
//		System.out.println(x << 2);
		
		System.out.println("오른쪽으로 쉬프트 : "+Integer.toBinaryString(x >> 2));
		System.out.println("왼쪽으로 쉬프트 : "+Integer.toBinaryString(x << 2));
	}
}

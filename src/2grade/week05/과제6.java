package week05;

public class ����6 {
	public static void main(String[] args) {
		int x = 20;
//		64 32 16 8 4 2 1
//		 0  0  1 0 1 0 0
//		 0  0  0 0 1 0 1 
//		 1  0  1 0 0 0 0
		
//		System.out.println(x >> 2);
//		System.out.println(x << 2);
		
		System.out.println("���������� ����Ʈ : "+Integer.toBinaryString(x >> 2));
		System.out.println("�������� ����Ʈ : "+Integer.toBinaryString(x << 2));
	}
}

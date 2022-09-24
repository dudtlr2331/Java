package week04;

public class Ex7 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0 || i % 9 == 0)
				System.out.println("7 or 9ÀÇ ¹è¼ö : " + i);
		}
	}
}

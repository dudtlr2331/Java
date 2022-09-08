package week05;

public class AccessDemo2 {
	
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		AccessEx ex = new AccessEx();
		ex.a = 10;
		ex.b = 20;
		ex.c = 30;
//		ex.d = 40;
		
	}

}

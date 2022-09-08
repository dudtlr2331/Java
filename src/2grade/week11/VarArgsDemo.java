package week11;

public class VarArgsDemo {
	public static void main(String[] args) {
		VarArgsDemo vd = new VarArgsDemo();
		
		vd.printSum("hoho", 1, 2, 3, 4, 5);
		vd.printSum("hehe", 10, 20, 30);
	}
//	public void printSum(int a, int b, int c, int d, int e) {}
//	public void printSum(int a, int b, int c) {}
	
	public void printSum(String s, int... v) { // <-- java에서 배열 형태로 저장됨 , 가변 변수는 마지막 인자로 선언해야됨
		int sum = 0;
		
		System.out.println(s);
		
		for(int i : v)
			sum += i;
		System.out.println(sum);
		System.out.println("=======================");
		for(int i = 0; i < v.length; i++)
			sum += i;
		System.out.println(sum);
	}
}

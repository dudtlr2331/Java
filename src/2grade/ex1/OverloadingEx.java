package ex1;

public class OverloadingEx {
	// 메서드오버로딩 : 동일 클래스 내에서 동일한 이름의 메서드를 여러개 정의
	// 반드시 메서드 이름은 동일, 매개변수의 갯수나 타입은 반드시 다르게 선언
	// 접근제어자, 메서드 반환타입은 변경될 수 있음
	// 객체지향 프로그램에서는 객체의 다형성을 위해 메서드 오버로딩을 지원한다
	
	int sum(int a, int b) {
		System.out.println("sum(int a, int b) 메서드 호출");
		return a+b;
	}
	double sum(double d1, double d2) {
		System.out.println("sum(double d1, double d2) 메서드 호출");
		return d1+d2;
	}
	
	public static void main(String[] args) {
		OverloadingEx e = new OverloadingEx();
		System.out.println(e.sum(3 , 4));
		System.out.println(e.sum(3.2 , 4.2));
		
	}
}

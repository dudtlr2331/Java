package week07;

class ConstructorEx{
	double radius;
	String color;
	
	public ConstructorEx() {
		// this메서드을 이용하면 생성자의 중복코드를 최소화할 수 있다는 장점이 있다.
		this(10.0, "빨강");
//		this.radius = 10.0;
//		color = "빨강";
	}
	public ConstructorEx(double radius, String color) {
		this.radius = radius;
		this.color = color;
		
	}
	public ConstructorEx(double radius) {
		this(radius, "파랑");
//		this.radius = radius;
//		this.color = "파랑";
	}
	public ConstructorEx(String color) {
	// this메서드는 메서드의 첫번째 라인에 기술해야함
		this(20.0, color);
//		this.radius = 20.0;
//		this.color = color;
		// 생성자는 인스턴스 메서드 호출 가능
		f();
		// 생성자에서 메서드의 이름을 이용하여 다른 생성자를 호출할 수는 없음
//		ConstructorEx(); // 객체 생성이 되지 않아서 호출이 불가능한듯??
	}
	void f() {
		
	}
	
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		ConstructorEx c1 = new ConstructorEx(10.0, "빨강");
		System.out.println(c1.color + ", " + c1.radius);
		
		ConstructorEx c2 = new ConstructorEx(5.0);
		System.out.println(c2.color + ", " + c2.radius);
		
		ConstructorEx c3 = new ConstructorEx("노랑");
		System.out.println(c3.color + ", " + c3.radius);
		
		ConstructorEx c4 = new ConstructorEx();
		System.out.println(c4.color + ", " + c4.radius);
	}

}

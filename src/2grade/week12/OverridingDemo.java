package week12;

import week08.*;
//import문을 이용하면 됨 - 컴파일러한테 미리 알려주는 역할을 함
//import week08.Array1Demo;을 이용하면 하나 하나 선언해야함 귀찮으니
//import week08.*을 이용하면 패키지 안에 모든 클래스을 이용할 수 있음

/*
 * 부모 클래스의 메서드와 동일한 반환타입, 매개변수를 사용한다.
 * 부모 클래스의 메서드보다 접근 범위를 더 좁게 수정할 수 없다.
 * 추가적인 예외가 발생할 수 있음을 나타낼 수 없다.
 * 슈퍼 클래스의 필드와 메소드는 기본적으로 서브 클래스에 상속
 * 슈퍼 클래스 중에서 일부를 서브 클래스로 상속하지 않으려면 private 접근 제어 수식어 사용
 * *****private으로 지정된 필드나 메소드는 서브 클래스로 상속되지 않음
 * 정적메소드: 클래스 소속이므로 자식 클래스에 상속되지 않음
 * final : 상속되지 않음
 */


// private 접근제한자를 가지는 멤버는 상속불가
// final 메서드는 오버라이딩 불가

class Circle{
	String color = "노랑";
	
	private void secret() { //private 접근제한자를 가지는 멤버는 상속불가
		System.out.println("비밀이다.");
	}
	
	protected void findRadius() {
		System.out.println("반지름이 10.0센티이다.");
	}
	public void findArea() {
		System.out.println("넓이는 (π*반지름*반지름)이다.");
	}
	public static void s() {
		System.out.println("static 메소드 s");
	}
	final void f() {
		System.out.println("final 메소드 f");
	}
}

class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	public void findColor() {
		System.out.println(color + " 공이다.");
		System.out.println(super.color + " 공이다."); //서브클래스에서 슈퍼클래스의 color를 이용하고 싶을 때는 super 이용한다.
	}
	public void findVolum() {
		System.out.println("부피는 4/3*(π*반지름*반지름)이다.");
	}

	//source 메뉴를 이용한 오버라이딩 연습
	//super 클래스에 있는 메소드와 타입이 동일해야함
	@Override
	public void findArea() {
		System.out.println("넓이는 4*(π*반지름*반지름)이다.");
		super.findArea(); //super클래스의 필드를 참조하고 싶을 때는 super라는 연산자를 이용
	}//super클래스의 기능에 기능을 추가 하고 싶을 때 사용	
	
	
	public static void s() {
		System.out.println("static 메소드 s..");
	}
//	void f() { // final 메서드는 오버라이딩 불가
//		System.out.println("final 메소드 f");
//	}
	
}

public class OverridingDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");
		
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
//		c1.secret();
		
		System.out.println("\n공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolum();
		c2.s();
		c2.f();
		
//		week08.Array1Demo a = new week08.Array1Demo(); //이렇게 사용하면 귀찮음
		Array1Demo a = new Array1Demo();
	}
}

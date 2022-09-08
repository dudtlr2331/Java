package week13;
//8
// 추상클래스 : 추상메서드를 하나 이상 가지는 클래스
// 추상메서드 : 선언만 존재하고 몸체를 가지지 않는 메서드
// 1. 추상클래스는 new 연산자를 이용해서 직접 객체를 생성할 수 없음
// 2. 추상클래스를 상속받은 서브클래스에서 추상클래스를 모두 구현해 주어야만 서브클래스를 객체로 생성할 수 있음
// 상속받은 서브클래스에서 반드시 필요한 메서드이지만 서브클래스마다 구현이 다를 경우 상속받은 서브클래스에서
// 구현할 수 있도록 추상메서드를 생성
// 목적 - 상속받은 서브클래스틀에서 구현되어야할 필수 메서드의 규격을 통일하기 위해서 사용 

// 추상메서드의 정의 : 내용이 없는 메서드, 구현(정의)는 하지 않고 선언만 한 메서드
// 추상클래스의 정의 : 한 개 이상의 추상메서드를 가지는 클래스
// 추상클래스의 사용 용도 : 추상메서드는 선언만되고 구현이 되지 않은 불완전한 메서드이므로 객체로 생성되어서는 안된다. 
//					 이런 클래스(추상메서드가 포함된 클래스)는 추상클래스로 선언하여 객체 생성을 금지시킵니다.


public class AbstractClassDemo {
	public static void main(String[] args) {
		//Shape s = new Shape();
		Circle c = new Circle(3);
		c.draw();
		System.out.println("원의 넓이는 %.1f\n", c.findArea());
		
		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.println("사각형의 넓이는 %.1f\n", r.findArea());
	}
}

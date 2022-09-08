package week14;
// 추상메서드의 정의
// 추상클래스의 정의
// 추상클래스의 사용 용도 : 규격을 정의하기 위한 용도로 사용된다.

// 슈퍼클래스의 추상메서드를 모두 구현한 서브클래스만 객체로 생성 가능

public class AbstractClassDemo {
	public static void main(String[] args) {
//		Shape s = new Shape(); //추상 클래스는 절대 객체로 생성할 수 없다.		
		
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n",
				c.findArea());
		
		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f\n",
				r.findArea());
	}
}

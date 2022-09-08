package week05;

public class Circle {
	private double radius;
	// setter / getter : private 멤버필드를 접근하기 위한 인터페이스
	// setter : private 멤버 필드에 값을 설정하기 위한 메소드
	// getter : private 멤버 필드에 값을 획득하기 위한 메소드
	// 특징 : 메소드의 이름이 get변수명 / set변수명으로 지칭

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %1.f\n", x, y);
	}

}

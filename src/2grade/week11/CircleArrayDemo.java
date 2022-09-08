package week11;

class Circle { // 객체형 배열 생성, 객체형 배열 참조 방법, 객체형 배열 중요 ☆☆☆☆☆
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	double findArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArrayDemo {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];
		
		for(int i = 0; i < circles.length; i++)
			circles[i] = new Circle(i + 1.0);
		for(int i = 0; i < circles.length; i++)
			System.out.printf("원의 넓이 (반지름 : %.1f) = %.2f\n",circles[i].radius , circles[i].findArea());
	}
}

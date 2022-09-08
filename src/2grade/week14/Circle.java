package week14;

//상속 관계에서 슈퍼클래스의 추상메서드를 모두 구현해야지 일반클래스가 될 수 있다.

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
		
	public double findArea() {
		return pi * radius * radius;
	}

	public void draw() {
		System.out.println("원을 그리다.");
	}
}

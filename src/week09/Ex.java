package week09;

class Circle {
	int radius = 0;

	Circle(){
		radius = 1;
	}
	
	Circle(int radius){
		this.radius = radius;
	}
	
	void show() {
		System.out.printf("반지름: %d\n", radius);
	}
}

class ColorCircle extends Circle {
	String color = "WHITE";
	
	ColorCircle(){
		super();
		this.color = "YELLOW";
	}
	ColorCircle(String color){
		super();
		this.color = color;
	}
	ColorCircle(int radius, String color){
		super(radius);
		this.color = color;
	}

	void show() {
		System.out.printf("반지름: %d, 색상: %s\n", radius, color);
	}
}

public class Ex {
	public static void main(String[] args) {
		ColorCircle c1 = new ColorCircle();
		c1.show();
		ColorCircle c2 = new ColorCircle("RED");
		c2.show();
		ColorCircle c3 = new ColorCircle(5, "BLUE");
		c3.show();
	}
}
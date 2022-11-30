package week12;

public class CircleDemo { 
	public static void main(String[] args) {
		double area;
		
		Circle myCircle = new Circle();
		
		myCircle.radius = 10.0;
		
		area = myCircle.findArea();
		
		myCircle.show(myCircle.radius, area);
	}
}

class Circle{
	double radius;
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		double area = findArea();
		System.out.printf("������ = %.1f, ���� = %.1f\n", x, y);
	}
}

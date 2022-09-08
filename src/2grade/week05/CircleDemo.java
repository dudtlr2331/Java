package week05;

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle();
				
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}
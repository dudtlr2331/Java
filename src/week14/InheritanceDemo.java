package week14;

public class InheritanceDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		Ball b = new Ball("������");
		
		System.out.println("�� : ");
		c.findRadius();
		c.findArea();
		
		System.out.println("\n �� : ");
		b.findRadius();
		b.findColor();
		b.findArea();
		b.findVolume();
	}
}

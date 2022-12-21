package week14;

public class InheritanceDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		Ball b = new Ball("»¡°£»ö");
		
		System.out.println("¿ø : ");
		c.findRadius();
		c.findArea();
		
		System.out.println("\n °ø : ");
		b.findRadius();
		b.findColor();
		b.findArea();
		b.findVolume();
	}
}

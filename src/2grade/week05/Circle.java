package week05;

public class Circle {
	private double radius;
	// setter / getter : private ����ʵ带 �����ϱ� ���� �������̽�
	// setter : private ��� �ʵ忡 ���� �����ϱ� ���� �޼ҵ�
	// getter : private ��� �ʵ忡 ���� ȹ���ϱ� ���� �޼ҵ�
	// Ư¡ : �޼ҵ��� �̸��� get������ / set���������� ��Ī

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
		System.out.printf("������ = %.1f, ���� = %1.f\n", x, y);
	}

}

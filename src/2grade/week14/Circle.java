package week14;

//��� ���迡�� ����Ŭ������ �߻�޼��带 ��� �����ؾ��� �Ϲ�Ŭ������ �� �� �ִ�.

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
		
	public double findArea() {
		return pi * radius * radius;
	}

	public void draw() {
		System.out.println("���� �׸���.");
	}
}

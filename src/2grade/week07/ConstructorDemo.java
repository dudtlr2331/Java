package week07;

class ConstructorEx{
	double radius;
	String color;
	
	public ConstructorEx() {
		// this�޼����� �̿��ϸ� �������� �ߺ��ڵ带 �ּ�ȭ�� �� �ִٴ� ������ �ִ�.
		this(10.0, "����");
//		this.radius = 10.0;
//		color = "����";
	}
	public ConstructorEx(double radius, String color) {
		this.radius = radius;
		this.color = color;
		
	}
	public ConstructorEx(double radius) {
		this(radius, "�Ķ�");
//		this.radius = radius;
//		this.color = "�Ķ�";
	}
	public ConstructorEx(String color) {
	// this�޼���� �޼����� ù��° ���ο� ����ؾ���
		this(20.0, color);
//		this.radius = 20.0;
//		this.color = color;
		// �����ڴ� �ν��Ͻ� �޼��� ȣ�� ����
		f();
		// �����ڿ��� �޼����� �̸��� �̿��Ͽ� �ٸ� �����ڸ� ȣ���� ���� ����
//		ConstructorEx(); // ��ü ������ ���� �ʾƼ� ȣ���� �Ұ����ѵ�??
	}
	void f() {
		
	}
	
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		ConstructorEx c1 = new ConstructorEx(10.0, "����");
		System.out.println(c1.color + ", " + c1.radius);
		
		ConstructorEx c2 = new ConstructorEx(5.0);
		System.out.println(c2.color + ", " + c2.radius);
		
		ConstructorEx c3 = new ConstructorEx("���");
		System.out.println(c3.color + ", " + c3.radius);
		
		ConstructorEx c4 = new ConstructorEx();
		System.out.println(c4.color + ", " + c4.radius);
	}

}

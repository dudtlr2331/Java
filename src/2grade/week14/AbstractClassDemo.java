package week14;
// �߻�޼����� ����
// �߻�Ŭ������ ����
// �߻�Ŭ������ ��� �뵵 : �԰��� �����ϱ� ���� �뵵�� ���ȴ�.

// ����Ŭ������ �߻�޼��带 ��� ������ ����Ŭ������ ��ü�� ���� ����

public class AbstractClassDemo {
	public static void main(String[] args) {
//		Shape s = new Shape(); //�߻� Ŭ������ ���� ��ü�� ������ �� ����.		
		
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n",
				c.findArea());
		
		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.printf("�簢���� ���̴� %.1f\n",
				r.findArea());
	}
}

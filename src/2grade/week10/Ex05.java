//package week10;
//
//import java.util.Scanner;
//
//class Circle {
//	private double x, y;
//	private double radius;
//
//	public Circle(double x, double y, double radius) {
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//
//	public void show() { // ��� show �޼���
//		System.out.println("x : " + x + " , y : " + y + " , radius : " + radius);
//	}
//
//	public double getArea() { // ���� ��� �޼��� �Ǽ� ����� ���� ��ȯ���� double��
//		return 3.14 * radius * radius;
//	}
//}
//
//public class Ex05 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); // Ű �Է� �ޱ� ����
//		Circle c[] = new Circle[3]; // ��Ŭ ��ü �迭 ����
//
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(i + 1 + "��° ���� x, y, radius ���� �Է����ּ��� >> ");
//			double x = sc.nextDouble(); // ��ĳ�� ��ü�� ���� ���ڿ��� �ޱ� ������
//			double y = sc.nextDouble(); // �ش� ���� �ڷ����� �´� ���·� ��ȯ
//			double radius = sc.nextInt();
//			c[i] = new Circle(x, y, radius); // ���� ������ ��Ŭ �����ڷ� ��ü ����
//		}
//		
//		int max = 0;
//		double temp = 0.0;
//		
//		for (int i = 0; i < c.length; i++) { // ��Ŭ ��ü�� show �޼��� ȣ���ϸ鼭 ���� �� ����
//			c[i].show();
//			if (c[i].getArea() > temp) {
//				max = i;
//				temp = c[i].getArea();
//			}
//		}
//
//		System.out.print("���� ������ ū ���� ");
//		c[max].show();
//
//	}
//}

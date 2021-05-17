package week10;

import java.util.Scanner;

class Circle {
	private double x, y;
	private double radius;

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("x : " + x + " , y : " + y + " , radius : " + radius);
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];

		for (int i = 0; i < c.length; i++) {
			System.out.print(i + 1 + "��° ���� x, y, radius ���� �Է����ּ��� >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		int max = 0;
		double temp = 0.0;
		
		for (int i = 0; i < c.length; i++) {
			c[i].show();
			if (c[i].getArea() > temp) {
				max = i;
				temp = c[i].getArea();
			}
		}

		System.out.println("���� ������ ū ���� " + (max+1)  + "�� ° ���Դϴ�.");
		c[max].show();

	}
}

package week02;

import week14.TV;

public class Week02Main {

	public static void main(String[] args) {
		System.out.println("main �޼ҵ� ����");
		
		//���� ���� : ��ü�� �������� �����ϴ� ����
		//���� ���� Ÿ�� : ������ ��ü�� Ŭ���� �̸�

//		TV tv;
//		tv = new TV();
		
		TV tv1 = new TV(); // ( )�� ������ ������ ����
		System.out.println(tv1);

		TV tv2 = new TV(); // ( )�� ������ ������ ����
		System.out.println(tv2);
		
//		tv1.change_channel(100);
//		System.out.println(tv1.channel);
		
		
		Car c1 = new Car();
		
		c1.change_color("blue");
		System.out.println(c1.color);
		c1.change_speed(200);
		System.out.println(c1.speed);
	}
}

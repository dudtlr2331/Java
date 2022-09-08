package week12;

import week08.*;
//import���� �̿��ϸ� �� - �����Ϸ����� �̸� �˷��ִ� ������ ��
//import week08.Array1Demo;�� �̿��ϸ� �ϳ� �ϳ� �����ؾ��� ��������
//import week08.*�� �̿��ϸ� ��Ű�� �ȿ� ��� Ŭ������ �̿��� �� ����

/*
 * �θ� Ŭ������ �޼���� ������ ��ȯŸ��, �Ű������� ����Ѵ�.
 * �θ� Ŭ������ �޼��庸�� ���� ������ �� ���� ������ �� ����.
 * �߰����� ���ܰ� �߻��� �� ������ ��Ÿ�� �� ����.
 * ���� Ŭ������ �ʵ�� �޼ҵ�� �⺻������ ���� Ŭ������ ���
 * ���� Ŭ���� �߿��� �Ϻθ� ���� Ŭ������ ������� �������� private ���� ���� ���ľ� ���
 * *****private���� ������ �ʵ峪 �޼ҵ�� ���� Ŭ������ ��ӵ��� ����
 * �����޼ҵ�: Ŭ���� �Ҽ��̹Ƿ� �ڽ� Ŭ������ ��ӵ��� ����
 * final : ��ӵ��� ����
 */


// private ���������ڸ� ������ ����� ��ӺҰ�
// final �޼���� �������̵� �Ұ�

class Circle{
	String color = "���";
	
	private void secret() { //private ���������ڸ� ������ ����� ��ӺҰ�
		System.out.println("����̴�.");
	}
	
	protected void findRadius() {
		System.out.println("�������� 10.0��Ƽ�̴�.");
	}
	public void findArea() {
		System.out.println("���̴� (��*������*������)�̴�.");
	}
	public static void s() {
		System.out.println("static �޼ҵ� s");
	}
	final void f() {
		System.out.println("final �޼ҵ� f");
	}
}

class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	public void findColor() {
		System.out.println(color + " ���̴�.");
		System.out.println(super.color + " ���̴�."); //����Ŭ�������� ����Ŭ������ color�� �̿��ϰ� ���� ���� super �̿��Ѵ�.
	}
	public void findVolum() {
		System.out.println("���Ǵ� 4/3*(��*������*������)�̴�.");
	}

	//source �޴��� �̿��� �������̵� ����
	//super Ŭ������ �ִ� �޼ҵ�� Ÿ���� �����ؾ���
	@Override
	public void findArea() {
		System.out.println("���̴� 4*(��*������*������)�̴�.");
		super.findArea(); //superŬ������ �ʵ带 �����ϰ� ���� ���� super��� �����ڸ� �̿�
	}//superŬ������ ��ɿ� ����� �߰� �ϰ� ���� �� ���	
	
	
	public static void s() {
		System.out.println("static �޼ҵ� s..");
	}
//	void f() { // final �޼���� �������̵� �Ұ�
//		System.out.println("final �޼ҵ� f");
//	}
	
}

public class OverridingDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("������");
		
		System.out.println("�� : ");
		c1.findRadius();
		c1.findArea();
//		c1.secret();
		
		System.out.println("\n�� : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolum();
		c2.s();
		c2.f();
		
//		week08.Array1Demo a = new week08.Array1Demo(); //�̷��� ����ϸ� ������
		Array1Demo a = new Array1Demo();
	}
}

package week13;
//6
class Parent{
	public void print() {
		System.out.println("����Ŭ������ print()�޼ҵ�");
	}
}

class Child extends Parent{
	public void print() {
		System.out.println("����Ŭ������ print()�޼ҵ�");
	}
	public void add() {
		System.out.println("����Ŭ������ aa()�޼ҵ�");
	}
}

public class CoercionCastDemo {
	public static void main(String[] args) {
		Parent p = new Child();
//		p.add(); //�ڵ� �� ��ȯ�� ���� ����Ŭ���� Ÿ������ ��ȯ�Ǿ����Ƿ� ���� ������ ����Ŭ������ ���
		//����Ŭ���� Ÿ���� ��ü�� ����Ŭ���� Ÿ������ ���� �� ��ȯ
		Child c = (Child)p;
//		Child c = new Child();
//		Parent p = c;
		c.add();
		c.print();
		p.print();
	}
}

package week13;
//5
// �������� �̿��� ��� ���α׷��� ��ü ���Ӽ��� ��ȭ��ų �� ����
// ��ü ���Ӽ� : ���Ǵ� ��ü�� ����� ��� ���α׷��� �����ϴ� ����

//class Parent{
//	public void print() {
//		System.out.println("����Ŭ������ print()�޼ҵ�");
//	}
//}
//
//class Child extends Parent{
//	public void print() {
//		System.out.println("����Ŭ������ print()�޼ҵ�");
//	}
//}

public class ParameterCastDemo {
	void printTest(Parent obj) {//����Ŭ���� Ÿ�� ����
		obj.print();
	}
	public static void main(String[] args) {
		ParameterCastDemo m = new ParameterCastDemo();
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
//		Child p2 = new Child(); //�̷��� �ص� ��� ����
		
		m.printTest(p1); //����Ŭ���� ��ü�� ����
		m.printTest(p2); //����Ŭ���� ��ü�� ����
	}
}

package ex1;

public class OverloadingEx {
	// �޼�������ε� : ���� Ŭ���� ������ ������ �̸��� �޼��带 ������ ����
	// �ݵ�� �޼��� �̸��� ����, �Ű������� ������ Ÿ���� �ݵ�� �ٸ��� ����
	// ����������, �޼��� ��ȯŸ���� ����� �� ����
	// ��ü���� ���α׷������� ��ü�� �������� ���� �޼��� �����ε��� �����Ѵ�
	
	int sum(int a, int b) {
		System.out.println("sum(int a, int b) �޼��� ȣ��");
		return a+b;
	}
	double sum(double d1, double d2) {
		System.out.println("sum(double d1, double d2) �޼��� ȣ��");
		return d1+d2;
	}
	
	public static void main(String[] args) {
		OverloadingEx e = new OverloadingEx();
		System.out.println(e.sum(3 , 4));
		System.out.println(e.sum(3.2 , 4.2));
		
	}
}

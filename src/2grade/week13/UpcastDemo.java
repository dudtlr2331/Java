package week13;
//3
public class UpcastDemo {
	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		// ���� Ŭ���� Ÿ���� ���������� ���� Ŭ���� Ÿ���� ��ü�� �����ϴ°��� �Ұ���
//		s = new Person(); //error
		
		//�ڵ� �� ��ȯ�� ���� ��ü�� ���� Ŭ������ Ÿ����
		//���������� ������ ��� �ڵ����� ��ȯ
		p = s; // �ڵ� �� ��ȯ

		// �ڵ� �� ��ȯ�� �̷���� ��� ���� Ŭ������ Ÿ���� ���� ������ �̿��Ͽ� ������ �� �ִ� ������
		// ���� Ŭ���� ������ ��ҵ�
//		p.numper = 1;
//		p.work();
		
		p.whoami();
	}
}

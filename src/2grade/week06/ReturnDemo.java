package week06;

public class ReturnDemo {

	public static void main(String[] args) {
		// ���� Ŭ�������� �����ϴ� �޼ҵ�������
		// static �޼ҵ�� instance �޼ҵ带 ���� ȣ���� �� ����
		// static �޼ҵ忡�� instance �޼ҵ带 ȣ���ϱ� ���ؼ��� ��ü�� �����ϰ�
		// ��ü ������ ���� ������ �̿��Ͽ� ȣ��
		ReturnDemo rd = new ReturnDemo();
		rd.printScore(99);
		rd.printScore(120);
	}
	
	public void printScore(int score) {
		if (score <= 0 || score >= 100) {
			System.out.println("�߸��� ���� : " + score);
			return;
		}
		System.out.println("���� : " + score);
	}
}

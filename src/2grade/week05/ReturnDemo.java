package week05;

public class ReturnDemo {
	//���� �޼���
	//���� �޼��忡���� �Ϲ� �޼��带 ���� ȣ���� �� ����.
	//���� �޼��忡�� �Ϲ� �޼��带 ȣ���ϱ� ���ؼ��� ��ü ���� �� ȣ���ؾߵȴ�.
	public static void main(String[] args) {
		ReturnDemo rd = new ReturnDemo();
		rd.printScore(99);
		rd.printScore(120);
	}
	
	//�Ϲ� �޼���
	public void printScore(int score) {
		if (score <= 0 || score >= 100) {
			System.out.println("�߸��� ���� : " + score);
			return;
		}
		System.out.println("���� : " + score);
	}
}
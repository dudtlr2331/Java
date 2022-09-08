package week14;

public class ControllablePolyDemo {

	public static void main(String[] args) {
		/*
		 * ������ �߿�*****
		 * �ݵ�� ���
		 * ���������� �������̽� Ÿ������ ���� ����
		 * ���������� �������� �������̽� ����Ŭ���� �������� ����
		 */
		Controllable a = new TV();
		Controllable b = new Computer();
		a.turnOn();
		a.turnOff();
		b.turnOn();
		b.turnOff();
		
		Controllable[] controllable = 
			{ new TV(), new Computer() };
		
		for(Controllable c : controllable) { //�������� c���ٰ� ���� //�̷��� �ؼ� ���������� �������� �����ϰ� �ִ�.
			c.turnOn();
			c.turnOff();
		}
	}

}

/*
 * ���º� ������ �� �ִ� ���� ��������
 * ���� ������ �������
 * ����3 6�� 7�ϱ��� Ǯ�̳��� 8�Ͽ� ���ε�
 * ����Ž�� ���� ������ 5�� 10�к��� �ǽ� ������ 9��������
 */


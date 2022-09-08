package week11;
//Java������ ���� ����� �������� �ʴ´�.
// ����� �ǹ�,����
// ��� ���
// ��ӽ� �������� ȣ�� ����
// ����Ŭ������ �����ڿ��� ����Ŭ������ ������ ���� ȣ�� ���
class Car{
	public Car() {
		System.out.println("����Ŭ���� Car�� �⺻������ ����");
	}
	public Car(String str) {
		System.out.println("����Ŭ���� Car�� ������ ���� " + str);
	}
	
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	void downSpeed(int value) {
		speed = speed - value;
	}
}

class Sedan extends Car{
	int seatNum;
	public Sedan() {
		//super() �޼���� ����Ŭ������ Ư�� �����ڸ� ������ ȣ���ϱ� ���� ȣ�� 
		super("hohoh"); // ������ �� Ÿ���� �¾ƾ���. // super()�� ù �ٿ� ����Ǿ���Ѵ�.
		System.out.println("����Ŭ���� Sedan�� ������ ����");
	}
	int getSeatNum() {
//		super("hohoh"); // super�� �ڽ� Ŭ������ �����ڿ����� ����� �� �ִ� Ű�����.
		return seatNum;
	}
}

class Truck extends Car{
	int capacity;
	int getcapacity() {
		return capacity;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
		Truck truck1 = new Truck();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("�¿��� �ӵ��� " + sedan1.speed +
				"km, �¼����� " + sedan1.getSeatNum() + "�� �Դϴ�.");
		System.out.println("Ʈ�� �ӵ��� " + truck1.speed +
				"km, ���緮�� " + truck1.getcapacity() + "�� �Դϴ�.");
	}
}

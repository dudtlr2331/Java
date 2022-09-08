package week08;

class Car {
	int speed;
}

//�ڡ��߿�ڡ� �迭�� ���� ��� int [] a  = new int [5];  ,  Car car[] = new Car[3];
// �迭�� ���� ���� ���, ��� ������ �ϴ��� => call by reference ������� ���޵�

public class ArrayParamEx {
	void changeVal(Car[] c) { // call by reference ������� ���޵�
		for (int i = 0; i < c.length; i++)
			c[i].speed = i + 12;
	}

	public static void main(String[] args) {
		Car car[] = new Car[3];

		for (int i = 0; i < car.length; i++)
			car[i] = new Car();

		ArrayParamEx ex = new ArrayParamEx();
		ex.changeVal(car);

		for (int i = 0; i < car.length; i++)
			System.out.println(i + " : " + car[i].speed);

	}
}

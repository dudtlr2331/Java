package week14;

class Car{
	int speed = 0;
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("���� �ӵ�(�θ�Ŭ����): " + this.speed);
	}
}

class Sedan extends Car{
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 150) this.speed = 150;
		System.out.println("���� �ӵ�(�ڽ�Ŭ����): " + this.speed);
	}
}

class Truck extends Car {}

public class CarDemo {
	public static void main(String[] args) {
		Truck truck1 = new Truck();
		Sedan sedan = new Sedan();
		System.out.println("Ʈ��"); truck1.upSpeed(200);
		System.out.println("����"); sedan.upSpeed(200);
	}
}

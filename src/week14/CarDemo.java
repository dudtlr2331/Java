package week14;

class Car{
	int speed = 0;
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재 속도(부모클래스): " + this.speed);
	}
}

class Sedan extends Car{
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 150) this.speed = 150;
		System.out.println("현재 속도(자식클래스): " + this.speed);
	}
}

class Truck extends Car {}

public class CarDemo {
	public static void main(String[] args) {
		Truck truck1 = new Truck();
		Sedan sedan = new Sedan();
		System.out.println("트럭"); truck1.upSpeed(200);
		System.out.println("세단"); sedan.upSpeed(200);
	}
}

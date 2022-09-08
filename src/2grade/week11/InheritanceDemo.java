package week11;
//Java에서는 다중 상속을 지원하지 않는다.
// 상속의 의미,개념
// 상속 방법
// 상속시 생성자의 호출 순서
// 서브클래스의 생성자에서 슈퍼클래스의 생성자 강제 호출 방법
class Car{
	public Car() {
		System.out.println("슈퍼클래스 Car의 기본생성자 실행");
	}
	public Car(String str) {
		System.out.println("슈퍼클래스 Car의 생성자 실행 " + str);
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
		//super() 메서드는 슈퍼클래스의 특정 생성자를 강제로 호출하기 위해 호출 
		super("hohoh"); // 인자의 수 타입이 맞아야함. // super()는 첫 줄에 선언되어야한다.
		System.out.println("서브클래스 Sedan의 생성자 실행");
	}
	int getSeatNum() {
//		super("hohoh"); // super는 자식 클래스의 생성자에서만 사용할 수 있는 키워드다.
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
		
		System.out.println("승용차 속도는 " + sedan1.speed +
				"km, 좌석수는 " + sedan1.getSeatNum() + "개 입니다.");
		System.out.println("트럭 속도는 " + truck1.speed +
				"km, 적재량은 " + truck1.getcapacity() + "톤 입니다.");
	}
}

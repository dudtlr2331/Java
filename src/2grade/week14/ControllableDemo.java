package week14;

//변수를 인터페이스 타입으로 선언이 가능하다

public class ControllableDemo {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		
		tv.turnOn();
		tv.turnOff();
		com.turnOn();
		com.turnOff();
	}

}

package week08;

class Car {
	int speed;
}

//★★중요★★ 배열의 선언 방법 int [] a  = new int [5];  ,  Car car[] = new Car[3];
// 배열의 인자 전달 방법, 어떻게 전달을 하는지 => call by reference 방식으로 전달됨

public class ArrayParamEx {
	void changeVal(Car[] c) { // call by reference 방식으로 전달됨
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

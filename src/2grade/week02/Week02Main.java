package week02;

import week14.TV;

public class Week02Main {

	public static void main(String[] args) {
		System.out.println("main 메소드 실행");
		
		//참조 변수 : 객체와 참조값을 저장하는 변수
		//참조 변수 타입 : 참조할 객체의 클래스 이름

//		TV tv;
//		tv = new TV();
		
		TV tv1 = new TV(); // ( )는 생성자 종류를 지정
		System.out.println(tv1);

		TV tv2 = new TV(); // ( )는 생성자 종류를 지정
		System.out.println(tv2);
		
//		tv1.change_channel(100);
//		System.out.println(tv1.channel);
		
		
		Car c1 = new Car();
		
		c1.change_color("blue");
		System.out.println(c1.color);
		c1.change_speed(200);
		System.out.println(c1.speed);
	}
}

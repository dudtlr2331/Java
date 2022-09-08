package week12;

class Animal {
	// 클래스에 생성자가 정의되지 않을 경우 컴파일 단계에서 기본 생성자가 자동으로 생성됨
	// 생성자가 하나라도 존재할 경우 기본생성자는 자동으로 생성되지 않음
	
	/*	 
	public Animal() {
		System.out.println("슈퍼클래스의 기본 생성자");
	}*/
	public Animal(String s) {
		System.out.println("동물 : " + s);
	}
}

class Mammal extends Animal {
	public Mammal() {
		//생성자의 호출 순서는 슈퍼클래스의 생성자 우선, 서브클래스의 생성자 순으로 호출
		//서브클래스의 생성자에서는 슈퍼클래스의 기본생성자를 호출
		
//		 super();
		 super("원숭이"); //기본생성자을 호출할 수 없으므로 문자열을 가지는 생성자 호출
		System.out.println("포유류 : 원숭이");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal apc = new Mammal();
		Mammal lion = new Mammal("사자");
		
	}
}

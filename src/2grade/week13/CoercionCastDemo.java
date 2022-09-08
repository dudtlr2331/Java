package week13;
//6
class Parent{
	public void print() {
		System.out.println("슈퍼클래스의 print()메소드");
	}
}

class Child extends Parent{
	public void print() {
		System.out.println("서브클래스의 print()메소드");
	}
	public void add() {
		System.out.println("서브클래스의 aa()메소드");
	}
}

public class CoercionCastDemo {
	public static void main(String[] args) {
		Parent p = new Child();
//		p.add(); //자동 형 변환에 의해 슈퍼클래스 타입으로 변환되었으므로 참조 범위가 슈퍼클래스로 축소
		//슈퍼클래스 타입의 객체를 서브클래스 타입으로 강제 형 변환
		Child c = (Child)p;
//		Child c = new Child();
//		Parent p = c;
		c.add();
		c.print();
		p.print();
	}
}

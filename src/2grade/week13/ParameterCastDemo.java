package week13;
//5
// 다형성을 이용할 경우 프로그램의 객체 종속성을 완화시킬 수 있음
// 객체 종속성 : 사용되는 객체가 변경될 경우 프로그램을 수정하는 정도

//class Parent{
//	public void print() {
//		System.out.println("슈퍼클래스의 print()메소드");
//	}
//}
//
//class Child extends Parent{
//	public void print() {
//		System.out.println("서브클래스의 print()메소드");
//	}
//}

public class ParameterCastDemo {
	void printTest(Parent obj) {//슈퍼클래스 타입 선언
		obj.print();
	}
	public static void main(String[] args) {
		ParameterCastDemo m = new ParameterCastDemo();
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
//		Child p2 = new Child(); //이렇게 해도 상관 없다
		
		m.printTest(p1); //슈퍼클래스 객체를 전달
		m.printTest(p2); //서브클래스 객체를 전달
	}
}

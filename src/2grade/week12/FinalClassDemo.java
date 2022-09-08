package week12;

class Good {
	//final 메서드는 오버라이딩 불가 메소드
	final void f() {
		
	}
}
class Better extends Good {
//	void f() {	}
}
final class Best extends Better { // final 키워드를 붙여진 클래스는 상속이 불가능하다
	
}
//class NumberOne extends Best {}

public class FinalClassDemo {
	public static void main(String[] args) {
		new Best();
	}
}

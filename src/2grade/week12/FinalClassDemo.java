package week12;

class Good {
	//final �޼���� �������̵� �Ұ� �޼ҵ�
	final void f() {
		
	}
}
class Better extends Good {
//	void f() {	}
}
final class Best extends Better { // final Ű���带 �ٿ��� Ŭ������ ����� �Ұ����ϴ�
	
}
//class NumberOne extends Best {}

public class FinalClassDemo {
	public static void main(String[] args) {
		new Best();
	}
}

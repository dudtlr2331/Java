package week13;
//3
public class UpcastDemo {
	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		// 서브 클래스 타입의 참조변수에 슈퍼 클래스 타입의 객체를 대입하는것은 불가능
//		s = new Person(); //error
		
		//자동 형 변환은 서브 객체를 슈퍼 클래스의 타입의
		//참조변수에 대입할 경우 자동으로 변환
		p = s; // 자동 형 변환

		// 자동 형 변환이 이루어질 경우 슈퍼 클래스의 타입의 참조 변수를 이용하여 참조할 수 있는 범위는
		// 슈퍼 클래스 범위로 축소됨
//		p.numper = 1;
//		p.work();
		
		p.whoami();
	}
}

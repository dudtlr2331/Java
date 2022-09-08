package week14;

public class ControllablePolyDemo {

	public static void main(String[] args) {
		/*
		 * 괜장히 중요*****
		 * 반드시 기억
		 * 참조변수를 인터페이스 타입으로 선언 가능
		 * 참조변수의 참조값은 인터페이스 구현클래스 참조값을 대입
		 */
		Controllable a = new TV();
		Controllable b = new Computer();
		a.turnOn();
		a.turnOff();
		b.turnOn();
		b.turnOff();
		
		Controllable[] controllable = 
			{ new TV(), new Computer() };
		
		for(Controllable c : controllable) { //참조변수 c에다가 대입 //이렇게 해서 참조변수의 다형성을 제공하고 있다.
			c.turnOn();
			c.turnOff();
		}
	}

}

/*
 * 오픈북 참조할 수 있는 모든걸 참조가능
 * 오늘 수업한 내용까지
 * 과제3 6월 7일까지 풀이내용 8일에 업로드
 * 진로탐색 과목 시험은 5시 10분부터 실시 문제는 9주차부터
 */


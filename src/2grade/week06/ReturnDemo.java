package week06;

public class ReturnDemo {

	public static void main(String[] args) {
		// 동일 클래스내에 존재하는 메소드일지라도
		// static 메소드는 instance 메소드를 직접 호출할 수 없음
		// static 메소드에서 instance 메소드를 호출하기 위해서는 객체를 생성하고
		// 객체 생성후 참조 변수를 이용하여 호출
		ReturnDemo rd = new ReturnDemo();
		rd.printScore(99);
		rd.printScore(120);
	}
	
	public void printScore(int score) {
		if (score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score);
			return;
		}
		System.out.println("점수 : " + score);
	}
}

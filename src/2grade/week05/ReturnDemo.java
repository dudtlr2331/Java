package week05;

public class ReturnDemo {
	//정적 메서드
	//정적 메서드에서는 일반 메서드를 직접 호출할 수 없음.
	//정적 메서드에서 일반 메서드를 호출하기 위해서는 객체 생성 후 호출해야된다.
	public static void main(String[] args) {
		ReturnDemo rd = new ReturnDemo();
		rd.printScore(99);
		rd.printScore(120);
	}
	
	//일반 메서드
	public void printScore(int score) {
		if (score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score);
			return;
		}
		System.out.println("점수 : " + score);
	}
}
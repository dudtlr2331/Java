package week14;

/* 인터페이스 : 제공될 서비스에 대한 규격
 * 용도 : 상속받은 구현클래스에서 반드시 구현되어야할 메서드에 대한 규격를 정의하는 용도로 사용한다.
 * 추상클래스와의 차이점 : 인터페이스는 상수 및 추상메서드만 선언
 * 인터페이스는 범위가 좁혀진거
 *
 * 디폴트 메서드 : 인터페이스에 새로운 메서드가 추가되더라도
 *			   기존의 구현클래스에 영향을 미치지 않도록 정의되는 메서드
 */

/*
  interface Coin{
  	int PENNY = 1, NICKEL =5, DIME = 10, QUARTER = 25;
  
  }
 */

public class Coin1Demo {
	public static void main(String[] args) {
		System.out.println("DIME은 " + Coin.DIME + "센트입니다.");
	}
}

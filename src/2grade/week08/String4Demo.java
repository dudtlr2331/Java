package week08;

public class String4Demo {

	public static void main(String[] args) {
		String str = new String("String 실습");
		
		//주어진 문자열 존재하면 true, 존재하지 않으면 false 리턴
		System.out.println(" contains() 메소드 : " + str.contains("실습"));
		System.out.println(" indexOf() 메소드 : " + str.indexOf("실습"));
		System.out.println(" replace() 메소드 : " + str.replace("실습", "Test"));
		System.out.println(" substring() 메소드 : " + str.substring(7));
		
		System.out.println("문자열 관련 함수 실행 후 원본 : " + str);
		String tel = " 123 - 456 ";
		//문자열의 좌/우 공백 제거
		System.out.println(tel.trim());
		//기본 타입의 값을 문자열로 반환
		System.out.println("valueOf() 메소드 : " + String.valueOf(12345));
	}

}

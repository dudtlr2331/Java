package week08;

public class StringDifferenceDemo {

	public static void main(String[] args) {
		String strcon1="홍길동";
		String strcon2="홍길동";
		String strnew1 = new String("홍길동");
		String strnew2 = new String("홍길동");
		
		if(strcon1==strcon2) {
			System.out.println("strcon1=" + strcon1 + ", strcon2=" + strcon2);
			System.out.println("동일한 인스턴스!!!");
		}else {
			System.out.println("strcon1=" + strcon1 + ", strcon2=" + strcon2);
			System.out.println("동일한 인스턴스 아님!!!");
		}
		if(strnew1==strnew2) {
			System.out.println("strnew1=" + strnew1 + ", strnew2=" + strnew2);
			System.out.println("동일한 인스턴스를 참조!!!");
		}
		else {
			System.out.println("strnew1=" + strnew1 + ", strnew2=" + strnew2);			
			System.out.println("동일한 인스턴스를 참조하지 않음!!!");
		}
		
		if(strcon1.equals(strcon2))
				System.out.println("동일한 문자열!!!");
		else
			System.out.println("동일한 문자열 아님!!!");
		
		if(strnew1.equals(strnew2))
			System.out.println("동일한 문자열!!!");
		else
			System.out.println("동일한 문자열 아님!!!");
		
	}

}

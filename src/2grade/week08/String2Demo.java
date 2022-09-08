package week08;

public class String2Demo {

	public static void main(String[] args) {
			String s1 = "Hi, Java!";
			String s2 = new String("Hi, Java!");
			String s3 = "Hi, Code!";
			String s4 = "Hi, java!";
			
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s4));
			System.out.println(s1.equalsIgnoreCase(s4));
			
			//사전에 기재되는 순서대로 비교
			// 0 : 같은 경우,
			// - : 매개변수안의 문자열보다 길이가 짧거나 순서가 앞설경우,
			// + : 길이가 길거나 뒤일경우
			//이런것도 있다
			System.out.println(s1.compareTo(s3));
			System.out.println(s1.compareToIgnoreCase(s4));
			System.out.println(s3.compareTo(s4));
			System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));
	}

}

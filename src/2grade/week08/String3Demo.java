package week08;

public class String3Demo {

	public static void main(String[] args) {
			String s1 = new String("Hi,");
			String s2 = new String(" Java");
			String s3, s4, s5;
			
			System.out.println("���ڿ� ���� (s1) : " + s1.length()); //3
			//���ڿ��� ó��/���� Ư�� ���ڿ����� Ȯ��
			System.out.println("startWith() : " + s1.startsWith("H") + " ,endWith() : " + s1.endsWith("H"));
			System.out.println("charAt(1) : " + s1.charAt(1)); //H
			
			s3 = s1.concat(s2);
			System.out.println("s1.concat(s2) : " + s3 + " , s1 : " + s1);
			System.out.println("toLowerCase() : " + s1.toLowerCase());
			System.out.println("substring(4, 8) : " + s3.substring(4, 8));
	}

}

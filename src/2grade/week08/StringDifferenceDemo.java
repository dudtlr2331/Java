package week08;

public class StringDifferenceDemo {

	public static void main(String[] args) {
		String strcon1="ȫ�浿";
		String strcon2="ȫ�浿";
		String strnew1 = new String("ȫ�浿");
		String strnew2 = new String("ȫ�浿");
		
		if(strcon1==strcon2) {
			System.out.println("strcon1=" + strcon1 + ", strcon2=" + strcon2);
			System.out.println("������ �ν��Ͻ�!!!");
		}else {
			System.out.println("strcon1=" + strcon1 + ", strcon2=" + strcon2);
			System.out.println("������ �ν��Ͻ� �ƴ�!!!");
		}
		if(strnew1==strnew2) {
			System.out.println("strnew1=" + strnew1 + ", strnew2=" + strnew2);
			System.out.println("������ �ν��Ͻ��� ����!!!");
		}
		else {
			System.out.println("strnew1=" + strnew1 + ", strnew2=" + strnew2);			
			System.out.println("������ �ν��Ͻ��� �������� ����!!!");
		}
		
		if(strcon1.equals(strcon2))
				System.out.println("������ ���ڿ�!!!");
		else
			System.out.println("������ ���ڿ� �ƴ�!!!");
		
		if(strnew1.equals(strnew2))
			System.out.println("������ ���ڿ�!!!");
		else
			System.out.println("������ ���ڿ� �ƴ�!!!");
		
	}

}

package week08;

public class String4Demo {

	public static void main(String[] args) {
		String str = new String("String �ǽ�");
		
		//�־��� ���ڿ� �����ϸ� true, �������� ������ false ����
		System.out.println(" contains() �޼ҵ� : " + str.contains("�ǽ�"));
		System.out.println(" indexOf() �޼ҵ� : " + str.indexOf("�ǽ�"));
		System.out.println(" replace() �޼ҵ� : " + str.replace("�ǽ�", "Test"));
		System.out.println(" substring() �޼ҵ� : " + str.substring(7));
		
		System.out.println("���ڿ� ���� �Լ� ���� �� ���� : " + str);
		String tel = " 123 - 456 ";
		//���ڿ��� ��/�� ���� ����
		System.out.println(tel.trim());
		//�⺻ Ÿ���� ���� ���ڿ��� ��ȯ
		System.out.println("valueOf() �޼ҵ� : " + String.valueOf(12345));
	}

}

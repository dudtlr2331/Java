package week06;

public class LocalVariableDemo {
	public double d;

	public static void main(String[] args) {
		LocalVariableDemo local = new LocalVariableDemo();
		System.out.println(local.d);

		int b; // ���������� �ʱ�ȭ���� �ʰ� ������ ���
//		System.out.println(b);
		{
			int c = 50;
			System.out.println("c = " + c);
		}
		// ���������� ���� ������ ���
//	System.out.println("c = " + c);
	}

}

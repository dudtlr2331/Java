package week11;

public class MainArgumentDemo {
	public static void main(String[] args) {
		MainArgumentDemo mg = new MainArgumentDemo();
		if(args.length == 2) {
			// args[1]�� ������ ��ȯ
			int i = Integer.parseInt(args[1]);
			mg.nPrintln(args[0], 1);
		}
	}
	
	public void nPrintln(String s, int n) {
		for(int i=0; i < n; i++)
			System.out.println(s);
	}
}

//���޵Ǵ� �������� Ÿ���� ���ƾ� �Ѵ�.
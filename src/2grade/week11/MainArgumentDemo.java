package week11;

public class MainArgumentDemo {
	public static void main(String[] args) {
		MainArgumentDemo mg = new MainArgumentDemo();
		if(args.length == 2) {
			// args[1]을 정수로 변환
			int i = Integer.parseInt(args[1]);
			mg.nPrintln(args[0], 1);
		}
	}
	
	public void nPrintln(String s, int n) {
		for(int i=0; i < n; i++)
			System.out.println(s);
	}
}

//전달되는 데이터의 타입이 같아야 한다.
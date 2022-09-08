package week06;

class Param {
	int x = 50, y = 60;
}

public class ParamDemo {

	public static void main(String[] args) {
		ParamDemo pd = new ParamDemo();
		Param p = new Param();

		int x = 10, y = 20;
		System.out.println("x = " + x + " y = " + y);
		System.out.println("Param = " + p + ", Param.x = " + p.x + ", Param.y = " + p.y);
		pd.changeParam(x, y, p);
		System.out.println("================================");
		System.out.println("x = " + x + " y = " + y);
		System.out.println("Param = " + p + ", Param.x = " + p.x + ", Param.y = " + p.y);
	}

	public void changeParam(int a, int b, Param p) {
		System.out.println(p);
		p.x = a;
		p.y = b;
		a = 50;
		b = 60;
	}

}

package week06;

public class MemberAccessDemo {
	private String color;
	public final int val = 30; // »ó¼ö
	private int temp;

	int memory;

	MemberAccessDemo(){
		System.out.println("hi");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("this : " + this);
		memoryUp(60);
		this.color = color;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	private void memoryUp(int n) {
		memory += n;
		this.setTemp(n);
	}
	
	public static void main(String[] args) {
		MemberAccessDemo m = new MemberAccessDemo();
		
		System.out.println(m);
		m.memory = 50;
		m.setColor("»¡°­");
		System.out.println(m.memory);
		System.out.println(m.getColor());
	}
}

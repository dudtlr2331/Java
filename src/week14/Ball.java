package week14;

public class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	protected void findColor() {
		System.out.println(color + "���̴�.");
	}
	private void findArea() {
		System.out.println("���̴� (����*������*������)�̴�.");
	}
	private void findVolume() {
		System.out.println("���̴� (����*������*������)�̴�.");
	}
}

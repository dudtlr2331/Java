package week14;

public class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "���̴�.");
	}
	public void findArea() {
		System.out.println("���̴� (����*������*������)�̴�.");
	}
	public void findVolume() {
		System.out.println("���̴� (����*������*������)�̴�.");
	}
}

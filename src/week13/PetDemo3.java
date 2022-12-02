package week13;

public class PetDemo3 {
	public static void main(String[] args) {
		Pet3 pet1 = new Pet3();
		pet1.move();
		pet1.DisplayAge();
		
		Pet3 pet2 = new Pet3("������", 10);
		pet2.move();
		pet2.DisplayAge();
		
		Pet3 pet3 = new Pet3("�����");
		pet3.move();
		pet3.DisplayAge();
		
		Pet3 pet4 = new Pet3(2);
		pet4.move();
		pet4.DisplayAge();
	}
}

class Pet3{
	private String type;
	private int age;
	
	Pet3(){
		this.type = "���Ƹ�";
		this.age = 5;
	}
	
	Pet3(String type, int age){
		this.type = type;
		this.age = age;
	}
	
	Pet3(String type){
		this.type = type;
		this.age = 5;
	}
	
	Pet3(int age){
		this.type = "���Ƹ�";
		this.age = age;
	}
	
	public void move(){
		System.out.println(getType() + "�� �����Դϴ�.");
	}
	
	public void DisplayAge(){
		System.out.println(getType() + "�� "+ age + "�����Դϴ�.");
	}

	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

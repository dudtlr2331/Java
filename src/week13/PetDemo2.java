package week13;

public class PetDemo2 {
	public static void main(String[] args) {
		Pet2 pet1 = new Pet2();
		pet1.setType("������");
		pet1.setAge(8);
		pet1.move();
		pet1.DisplayAge();
		
		Pet2 pet2 = new Pet2();
		pet2.setType("�����");
		pet2.setAge(13);
		pet2.move();
		pet2.DisplayAge();
	}
}

class Pet2{
	private String type;
	private int age;
	
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

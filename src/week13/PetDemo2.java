package week13;

public class PetDemo2 {
	public static void main(String[] args) {
		Pet2 pet1 = new Pet2();
		pet1.setType("강아지");
		pet1.setAge(8);
		pet1.move();
		pet1.DisplayAge();
		
		Pet2 pet2 = new Pet2();
		pet2.setType("고양이");
		pet2.setAge(13);
		pet2.move();
		pet2.DisplayAge();
	}
}

class Pet2{
	private String type;
	private int age;
	
	public void move(){
		System.out.println(getType() + "가 움직입니다.");
	}
	
	public void DisplayAge(){
		System.out.println(getType() + "는 "+ age + "개월입니다.");
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

package week13;

public class PetDemo {
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.type = "강아지";
		pet1.age = 8;
		pet1.move();
		pet1.getAge();
		
		Pet pet2 = new Pet();
		pet2.type = "고양이";
		pet2.age = 13;
		pet2.move();
		pet2.getAge();
	}
}

class Pet{
	String type;
	int age;
	
	void move(){
		System.out.println(type + "가 움직입니다.");
	}
	
	void getAge(){
		System.out.println(type + "는 "+ age + "개월입니다.");
	}
}

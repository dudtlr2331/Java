package week13;
//7
public class InstanceofDemo {
	public static void main(String[] args) {
		InstanceofDemo d = new InstanceofDemo();
		
		Student s = new Student();
		Person p = new Person();
		
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
		
//		System.out.println(s instanceof String);
		
		d.downcast(s);
	}
	void downcast(Person p) {
		if(p instanceof Student) {
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}
}
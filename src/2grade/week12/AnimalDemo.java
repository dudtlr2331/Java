package week12;

class Animal {
	// Ŭ������ �����ڰ� ���ǵ��� ���� ��� ������ �ܰ迡�� �⺻ �����ڰ� �ڵ����� ������
	// �����ڰ� �ϳ��� ������ ��� �⺻�����ڴ� �ڵ����� �������� ����
	
	/*	 
	public Animal() {
		System.out.println("����Ŭ������ �⺻ ������");
	}*/
	public Animal(String s) {
		System.out.println("���� : " + s);
	}
}

class Mammal extends Animal {
	public Mammal() {
		//�������� ȣ�� ������ ����Ŭ������ ������ �켱, ����Ŭ������ ������ ������ ȣ��
		//����Ŭ������ �����ڿ����� ����Ŭ������ �⺻�����ڸ� ȣ��
		
//		 super();
		 super("������"); //�⺻�������� ȣ���� �� �����Ƿ� ���ڿ��� ������ ������ ȣ��
		System.out.println("������ : ������");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("������ : " + s);
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Mammal apc = new Mammal();
		Mammal lion = new Mammal("����");
		
	}
}

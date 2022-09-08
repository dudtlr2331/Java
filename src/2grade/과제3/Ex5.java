package ����3;

import java.util.Scanner;

class Machine{
	private String name[];
    private int price[];
    private int money;
    
    Machine(String name[], int price[], int money){
        this.name = name;
        this.price = price;
        this.money = money;
    }
    
    public void ��ǰ����() {
		for(int i=0; i < name.length; i++) {
			System.out.println(i+1 + "." + getName(i) + " >> " + getPrice(i) + "��");
		}
	}
    
    public void ��ǰ����(int num) {
    	this.money -= price[num];
    	System.out.println("�Ž����� : " + money + "���Դϴ�.");
    	
    	int[] base = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		for (int n : base) {
			if (money / n != 0)
				System.out.println(n + "���� " + money / n + "��");
			money %= n;
		}
    }
    
    public String getName(int i) {
         return name[i];
    }
    public int getPrice(int i) {
        return price[i];
    }
}
class DrinkMachine extends Machine{
	int[] price = { 1500, 1200, 1000 };
	String[] can = { "", "���̴�", "ȯŸ" };
	
	DrinkMachine(String[] name, int[] price, int money) {
		super(name, price, money);
	}
	
}
class CoffeeMachine extends Machine{

	CoffeeMachine(String[] name, int[] price, int money) {
		super(name, price, money);
	}
	
}


public class Ex5 {
	public static void main(String[] args) {
		int[] price = { 1500, 1200, 1000 };
		String[] can = { "�ݶ�", "���̴�", "ȯŸ" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �־��ּ��� : ");
		int money = sc.nextInt();
		
		Machine m = new Machine(can, price, money);

		m.��ǰ����();
		
		System.out.print("�����Ͻ� ��ǰ�� ��ȣ�� �Է����ּ��� : ");
		int num = sc.nextInt()-1;
		
		m.��ǰ����(num);
		
		
		
	}
}

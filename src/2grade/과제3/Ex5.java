package 과제3;

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
    
    public void 상품보기() {
		for(int i=0; i < name.length; i++) {
			System.out.println(i+1 + "." + getName(i) + " >> " + getPrice(i) + "원");
		}
	}
    
    public void 상품구입(int num) {
    	this.money -= price[num];
    	System.out.println("거스름돈 : " + money + "원입니다.");
    	
    	int[] base = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		for (int n : base) {
			if (money / n != 0)
				System.out.println(n + "원권 " + money / n + "개");
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
	String[] can = { "", "사이다", "환타" };
	
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
		String[] can = { "콜라", "사이다", "환타" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈을 넣어주세요 : ");
		int money = sc.nextInt();
		
		Machine m = new Machine(can, price, money);

		m.상품보기();
		
		System.out.print("구입하실 제품의 번호을 입력해주세요 : ");
		int num = sc.nextInt()-1;
		
		m.상품구입(num);
		
		
		
	}
}

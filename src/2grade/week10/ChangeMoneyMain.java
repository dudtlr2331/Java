package week10;

import java.util.Scanner;
class ChangeMoney {
	Scanner in = new Scanner(System.in);
	private int [] unit;
	private int [] change;
	
	public ChangeMoney(int[] unit) {
		this.unit = unit;
		this.change = new int[unit.length];
	}
	int inputMoney() {
		System.out.print("금액을 입력하시오>>");
		return in.nextInt();
	}
	void calMoney(int money) {
		for(int i=0; i<unit.length; i++) {
			int res = money/unit[i]; // unit[i]의 개수 계산
			if (res > 0) { // 몫이 있는 경우
				change[i] = res;
				money = money%unit[i]; // money 갱신
			}
		}
	}
	public int[] getChange() {
		return change;
	}
}
public class ChangeMoneyMain{
	public static void main (String args[])  {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		int [] change;
		
		ChangeMoney cm = new ChangeMoney(unit);
		int money = cm.inputMoney();
		cm.calMoney(money);
		change = cm.getChange();
		for(int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "원 짜리 : " + change[i] + "개");
		}

	}
}
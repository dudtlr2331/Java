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
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		return in.nextInt();
	}
	void calMoney(int money) {
		for(int i=0; i<unit.length; i++) {
			int res = money/unit[i]; // unit[i]�� ���� ���
			if (res > 0) { // ���� �ִ� ���
				change[i] = res;
				money = money%unit[i]; // money ����
			}
		}
	}
	public int[] getChange() {
		return change;
	}
}
public class ChangeMoneyMain{
	public static void main (String args[])  {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
		int [] change;
		
		ChangeMoney cm = new ChangeMoney(unit);
		int money = cm.inputMoney();
		cm.calMoney(money);
		change = cm.getChange();
		for(int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "�� ¥�� : " + change[i] + "��");
		}

	}
}
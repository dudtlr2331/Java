package week13;
//4
class Account{}
class CheckingAccount extends Account{}
class BonusPointAccount extends Account{}


public class AutoCastDemo {
	public static void main(String[] args) {
		Account account1 = new CheckingAccount();
		Account account2 = new BonusPointAccount();
		
		//��� ���� ���� Ŭ���� ������ ������ ���� �Ұ�
	//	CheckingAccount ca = new BonusPointAccount();
	}
}

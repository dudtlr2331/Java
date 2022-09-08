package week13;
//4
class Account{}
class CheckingAccount extends Account{}
class BonusPointAccount extends Account{}


public class AutoCastDemo {
	public static void main(String[] args) {
		Account account1 = new CheckingAccount();
		Account account2 = new BonusPointAccount();
		
		//상속 받은 서브 클래스 간에는 다형성 적용 불가
	//	CheckingAccount ca = new BonusPointAccount();
	}
}

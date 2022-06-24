package ch10.clentException;

public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	//잔고에 money 누적
	public void deposit(int money) {
		balance += money; //계좌에 돈 넣음
	}
	
	public void withdraw(int money) throws BalanceException{
		if(balance < money) { //잔고가 money보다 작으면
			throw new BalanceException("잔고 부족 : " + (money - balance) + "원 모자랍니다.");
		}//사용자 정의 예외 발생
		balance -= money;
	}
	
}

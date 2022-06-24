package ch06.ch06.balance;

public class Account {
	//ÇÊµå
	private int Balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}else {
			this.Balance = balance;
		}
	}
}

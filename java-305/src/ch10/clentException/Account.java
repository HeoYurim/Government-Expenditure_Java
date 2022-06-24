package ch10.clentException;

public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	//�ܰ� money ����
	public void deposit(int money) {
		balance += money; //���¿� �� ����
	}
	
	public void withdraw(int money) throws BalanceException{
		if(balance < money) { //�ܰ� money���� ������
			throw new BalanceException("�ܰ� ���� : " + (money - balance) + "�� ���ڶ��ϴ�.");
		}//����� ���� ���� �߻�
		balance -= money;
	}
	
}

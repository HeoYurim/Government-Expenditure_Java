package ch06.ch06.balance;

public class AccountEx {

	public static void main(String[] args) {

		Account account = new Account(); //��ü ����
		
		account.setBalance(10000); //���� �Է�
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(-100); // -�ݾ� �Է�(�� ����)
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(2000000); //200���� �Է�(�� ����)
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(300000); //30���� �Է�
		System.out.println("���� �ܰ�: " + account.getBalance());
		
	}

}

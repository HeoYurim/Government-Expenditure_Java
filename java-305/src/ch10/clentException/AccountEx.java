package ch10.clentException;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		//3���� �����ϱ�
		account.deposit(30000);
		
		//���ݾ� Ȯ���ϱ�
		System.out.println("���ݾ� : " + account.getBalance());
		
		//����ϱ�
		try { //1���� ��ݽ� ���� �߻�
			System.out.println("������ ����մϴ�.");
			account.withdraw(10000);
			System.out.println("���ݾ� : " +account.getBalance());
		}catch (BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); //���� ��ô
		}
		
		/*
		//�����ϱ�
		Account account = new Account();
		
		//���� �����ϱ�
		account.deposit(10000);
		
		//���ݾ� Ȯ���ϱ�
		System.out.println("���ݾ� : " + account.getBalance());
		
		//����ϱ�
		try { //3���� ��ݽ� ���� �߻�
			account.withdraw(30000);
		}catch (BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); //���� ��ô
		}
		*/
	}

}

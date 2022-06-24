package ch06.ch06.balance;

public class AccountEx {

	public static void main(String[] args) {

		Account account = new Account(); //객체 생성
		
		account.setBalance(10000); //만원 입력
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100); // -금액 입력(값 유지)
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000); //200만원 입력(값 유지)
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000); //30만원 입력
		System.out.println("현재 잔고: " + account.getBalance());
		
	}

}

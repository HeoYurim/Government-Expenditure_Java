package ch10.clentException;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		//3만원 예금하기
		account.deposit(30000);
		
		//예금액 확인하기
		System.out.println("예금액 : " + account.getBalance());
		
		//출금하기
		try { //1만원 출금시 예외 발생
			System.out.println("만원을 출금합니다.");
			account.withdraw(10000);
			System.out.println("예금액 : " +account.getBalance());
		}catch (BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); //예외 추척
		}
		
		/*
		//예금하기
		Account account = new Account();
		
		//만원 예금하기
		account.deposit(10000);
		
		//예금액 확인하기
		System.out.println("예금액 : " + account.getBalance());
		
		//출금하기
		try { //3만원 출금시 예외 발생
			account.withdraw(30000);
		}catch (BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); //예외 추척
		}
		*/
	}

}

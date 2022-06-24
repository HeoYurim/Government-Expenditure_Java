package ch06.account;

import java.util.*;

public class BankEx {

	private static Account[] accountArray = new Account[100];
	private static Scanner scan  = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true; //프로그램 반복 실행용
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNum = scan.nextInt(); //1 ~ 5번까지 입력 값
			
			//1~5외에 글자 입력시 오류 출력문 입력
			if(selectNum == 1) {
				createAccount();
			}else if(selectNum == 2) {
				accountList();
			}else if(selectNum == 3) {
				deposit();
			}else if(selectNum == 4) {
				withdraw();
			}else if(selectNum == 5) {
				run = false; //프로그램 종료
			}else {
				System.out.println("번호 선택을 다시 해주세요.");
			}
			
		}//while문 종료
		System.out.println("프로그램 종료");
		
	}//main문 종료
	
	private static void createAccount() {
		
		System.out.println(" --------");
		System.out.println("| 계좌생성 |");
		System.out.println(" --------");
		
		System.out.print("계좌번호 : ");
		String ano = scan.next(); //계좌번호 입력하여 ano로 전달
		System.out.print("계좌주 : ");
		String owner = scan.next(); //계좌주를 입력하여 owner로 전달 -> nextLine으로 쓰면 그냥 넘어감
		System.out.print("초기 입금액 : ");
		int balance = scan.nextInt(); //초기 금액 입력하여 balance로 전달
		
		Account newAccount = new Account(ano, owner, balance); //3개의 객체를 생성함
		
		for(int i =0; i<accountArray.length; i++) { //배열의 반복
			if(accountArray[i] == null) { //배열 중 null 위치를 찾아 넣기
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}		
	}//createAccoout 종료
	
	private static void accountList() {
		
		System.out.println(" --------");
		System.out.println("| 계좌목록 |");
		System.out.println(" --------");
		
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("      ");
				System.out.print(account.getOwner());
				System.out.print("      ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
		
		
	}//accountList 종료
	
	private static void deposit() {
		System.out.println(" --------");
		System.out.println("|  예금   |");
		System.out.println(" --------");
		
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		System.out.print("예금액 : ");
		int money = scan.nextInt();
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공되었습니다.");
		System.out.println("현재 금액 : " + account.getBalance());
		
	}//deposit 종료
	
    private static void withdraw() {
    	System.out.println(" --------");
		System.out.println("|  출금   |");
		System.out.println(" --------");
		
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		System.out.print("출금액 : ");
		int money = scan.nextInt();
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");
		System.out.println("현재 금액 : " + account.getBalance());
	}//withdraw 종료
	
    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano) {
    	Account account = null;
    	for(int i = 0; i < accountArray.length; i++) {
    		if(accountArray[i] != null) {
    			String dbAno = accountArray[i].getAno();
    			if(dbAno.equals(ano)) {
    				account = accountArray[i];
    				break;
    			}
    		}
    		
    	}
    	return account;
    } //findAccount문 종료
}
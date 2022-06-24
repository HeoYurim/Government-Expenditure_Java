package ch06.drinks;

import java.util.*;

import ch06.account.*;

public class DrinkEx {

	private static Drink[] idArray = new Drink[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("1. ID 생성 | 2. ID 확인| 3. 돈 입금 | 4. 음료 선택 | 5. 돈 반환 | 6. 종료");
			System.out.println("----------------------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNum = scan.nextInt();
			
			if(selectNum == 1) {
				createId();
			}else if(selectNum ==2) {
				checkId();
			}else if(selectNum ==3) {
				inputMoney();
			}else if(selectNum ==4) {
				selectDrink();
			}else if(selectNum ==5) {
				returnMoney();
			}else if(selectNum ==6) {
				run = false;
			}else {
				System.out.println("번호를 다시 입력해주세요.");
			}
			System.out.println("프로그램 종료");
		}
		
	}
	
	private static void createId() {
		System.out.println(" --------");
		System.out.println("| ID 생성 |");
		System.out.println(" --------");	
		
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String number = scan.next();
		System.out.print("초기 입금액 : ");
		int balance = scan.nextInt();
		
		Drink newId = new Drink(id,number, balance);
		
		for(int i = 0; i<idArray.length; i++) {
			if(idArray[i] == null) {
				idArray[i] = newId;
				System.out.println("결과 : 회원가입이 완료되었습니다.");
				break;
			}
		}
	}
	
	private static void checkId() {
		System.out.println(" --------");
		System.out.println("| ID 확인 |");
		System.out.println(" --------");
		
		for(int i = 0; i < idArray.length; i++) {
			Drink checkidArray = idArray[i];
			if(checkidArray != null) {
				System.out.print(checkidArray.getId());
				System.out.print("      ");
				System.out.print(checkidArray.getNumber());
				System.out.print("      ");
				System.out.print(checkidArray.getBalance());
				System.out.println();
			}
		}
	}
	
	private static void inputMoney() {
		System.out.println(" --------");
		System.out.println("| 돈  입금 |");
		System.out.println(" --------");
		
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("입금액 : ");
		int balance = scan.nextInt();
		Drink id_2 = findAccount(id);
		
		if(id_2 == null) {
			System.out.println("결과 : ID가 없습니다.");
			return;
		}
		
		id_2.setBalance(id_2.getBalance() + balance);
		System.out.println("결과 : 입금이 성공되었습니다.");
		System.out.println("현재 금액 : " + id_2.getBalance());
	}
	
	private static Drink findAccount(String id) {
		Drink findId = null;
		for(int i = 0; i <idArray.length; i++) {
			if(idArray[i] != null) { //값에 없으면 id 추가
				String dbid = idArray[i].getId();
				if(dbid.equals(id)) {
					findId = idArray[i];
					break;
				}
			}
		}
		return findId;
	}
	
	private static void selectDrink() {

		System.out.print("ID : ");
		String id = scan.next();
		
		System.out.println("1. 아메리카노 | 2. 버블티 | 3. 스무디 ");
		System.out.print("번호를 골라주세요 : ");
		int selectdrink = scan.nextInt();
		
		if(selectdrink == 1) {
			System.out.println("아메리카노를 골랐습니다.");
			System.out.println("3500원입니다.");
			int balance = 3500;
			Drink id_2 = findAccount(id); 
			
			if(id_2 == null) {
				System.out.println("결과 : ID가 없습니다.");
				return;
			}
			
			id_2.setBalance(id_2.getBalance() - balance);
			System.out.println("결과 : 출금이 성공되었습니다.");
			System.out.println("현재 금액 : " + id_2.getBalance());
			System.out.println();
		}
		if(selectdrink == 2) {
			System.out.println("버블티를 골랐습니다.");
			System.out.println("4500원입니다.");
			int balance = 4500;
			Drink id_2 = findAccount(id); 
			
			if(id_2 == null) {
				System.out.println("결과 : ID가 없습니다.");
				return;
			}
			
			id_2.setBalance(id_2.getBalance() - balance);
			System.out.println("결과 : 출금이 성공되었습니다.");
			System.out.println("현재 금액 : " + id_2.getBalance());
		}
		if(selectdrink == 3) {
			System.out.println("스무디를 골랐습니다.");
			System.out.println("5500원입니다.");
			int balance = 5500;
			Drink id_2 = findAccount(id); 
			
			if(id_2 == null) {
				System.out.println("결과 : ID가 없습니다.");
				return;
			}
			
			id_2.setBalance(id_2.getBalance() - balance);
			System.out.println("결과 : 출금이 성공되었습니다.");
			System.out.println("현재 금액 : " + id_2.getBalance());
		}
	}
	
	private static void returnMoney() {
		System.out.println(" --------");
		System.out.println("| 돈  반환 |");
		System.out.println(" --------");
		
		System.out.print("ID : ");
		String id = scan.next();
		
		System.out.print("출금액 : ");
		int money = scan.nextInt();
		Drink id_2 = findAccount(id);
		
		if(id_2 == null) {
			System.out.println("결과 : ID가 없습니다.");
			return;
		}
		
		id_2.setBalance(id_2.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");
		System.out.println("현재 금액 : " + id_2.getBalance());
			
	}

}

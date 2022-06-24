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
			System.out.println("1. ID ���� | 2. ID Ȯ��| 3. �� �Ա� | 4. ���� ���� | 5. �� ��ȯ | 6. ����");
			System.out.println("----------------------------------------------------------------------------");
			System.out.print("���� > ");
			
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
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
			}
			System.out.println("���α׷� ����");
		}
		
	}
	
	private static void createId() {
		System.out.println(" --------");
		System.out.println("| ID ���� |");
		System.out.println(" --------");	
		
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String number = scan.next();
		System.out.print("�ʱ� �Աݾ� : ");
		int balance = scan.nextInt();
		
		Drink newId = new Drink(id,number, balance);
		
		for(int i = 0; i<idArray.length; i++) {
			if(idArray[i] == null) {
				idArray[i] = newId;
				System.out.println("��� : ȸ�������� �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	private static void checkId() {
		System.out.println(" --------");
		System.out.println("| ID Ȯ�� |");
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
		System.out.println("| ��  �Ա� |");
		System.out.println(" --------");
		
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("�Աݾ� : ");
		int balance = scan.nextInt();
		Drink id_2 = findAccount(id);
		
		if(id_2 == null) {
			System.out.println("��� : ID�� �����ϴ�.");
			return;
		}
		
		id_2.setBalance(id_2.getBalance() + balance);
		System.out.println("��� : �Ա��� �����Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + id_2.getBalance());
	}
	
	private static Drink findAccount(String id) {
		Drink findId = null;
		for(int i = 0; i <idArray.length; i++) {
			if(idArray[i] != null) { //���� ������ id �߰�
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
		
		System.out.println("1. �Ƹ޸�ī�� | 2. ����Ƽ | 3. ������ ");
		System.out.print("��ȣ�� ����ּ��� : ");
		int selectdrink = scan.nextInt();
		
		if(selectdrink == 1) {
			System.out.println("�Ƹ޸�ī�븦 ������ϴ�.");
			System.out.println("3500���Դϴ�.");
			int balance = 3500;
			Drink id_2 = findAccount(id); 
			
			if(id_2 == null) {
				System.out.println("��� : ID�� �����ϴ�.");
				return;
			}
			
			id_2.setBalance(id_2.getBalance() - balance);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
			System.out.println("���� �ݾ� : " + id_2.getBalance());
			System.out.println();
		}
		if(selectdrink == 2) {
			System.out.println("����Ƽ�� ������ϴ�.");
			System.out.println("4500���Դϴ�.");
			int balance = 4500;
			Drink id_2 = findAccount(id); 
			
			if(id_2 == null) {
				System.out.println("��� : ID�� �����ϴ�.");
				return;
			}
			
			id_2.setBalance(id_2.getBalance() - balance);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
			System.out.println("���� �ݾ� : " + id_2.getBalance());
		}
		if(selectdrink == 3) {
			System.out.println("������ ������ϴ�.");
			System.out.println("5500���Դϴ�.");
			int balance = 5500;
			Drink id_2 = findAccount(id); 
			
			if(id_2 == null) {
				System.out.println("��� : ID�� �����ϴ�.");
				return;
			}
			
			id_2.setBalance(id_2.getBalance() - balance);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
			System.out.println("���� �ݾ� : " + id_2.getBalance());
		}
	}
	
	private static void returnMoney() {
		System.out.println(" --------");
		System.out.println("| ��  ��ȯ |");
		System.out.println(" --------");
		
		System.out.print("ID : ");
		String id = scan.next();
		
		System.out.print("��ݾ� : ");
		int money = scan.nextInt();
		Drink id_2 = findAccount(id);
		
		if(id_2 == null) {
			System.out.println("��� : ID�� �����ϴ�.");
			return;
		}
		
		id_2.setBalance(id_2.getBalance() - money);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + id_2.getBalance());
			
	}

}

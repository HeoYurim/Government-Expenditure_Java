package ch06.account;

import java.util.*;

public class BankEx {

	private static Account[] accountArray = new Account[100];
	private static Scanner scan  = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true; //���α׷� �ݺ� �����
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. ���� ���� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.print("���� > ");
			
			int selectNum = scan.nextInt(); //1 ~ 5������ �Է� ��
			
			//1~5�ܿ� ���� �Է½� ���� ��¹� �Է�
			if(selectNum == 1) {
				createAccount();
			}else if(selectNum == 2) {
				accountList();
			}else if(selectNum == 3) {
				deposit();
			}else if(selectNum == 4) {
				withdraw();
			}else if(selectNum == 5) {
				run = false; //���α׷� ����
			}else {
				System.out.println("��ȣ ������ �ٽ� ���ּ���.");
			}
			
		}//while�� ����
		System.out.println("���α׷� ����");
		
	}//main�� ����
	
	private static void createAccount() {
		
		System.out.println(" --------");
		System.out.println("| ���»��� |");
		System.out.println(" --------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scan.next(); //���¹�ȣ �Է��Ͽ� ano�� ����
		System.out.print("������ : ");
		String owner = scan.next(); //�����ָ� �Է��Ͽ� owner�� ���� -> nextLine���� ���� �׳� �Ѿ
		System.out.print("�ʱ� �Աݾ� : ");
		int balance = scan.nextInt(); //�ʱ� �ݾ� �Է��Ͽ� balance�� ����
		
		Account newAccount = new Account(ano, owner, balance); //3���� ��ü�� ������
		
		for(int i =0; i<accountArray.length; i++) { //�迭�� �ݺ�
			if(accountArray[i] == null) { //�迭 �� null ��ġ�� ã�� �ֱ�
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}		
	}//createAccoout ����
	
	private static void accountList() {
		
		System.out.println(" --------");
		System.out.println("| ���¸�� |");
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
		
		
	}//accountList ����
	
	private static void deposit() {
		System.out.println(" --------");
		System.out.println("|  ����   |");
		System.out.println(" --------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scan.next();
		System.out.print("���ݾ� : ");
		int money = scan.nextInt();
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + account.getBalance());
		
	}//deposit ����
	
    private static void withdraw() {
    	System.out.println(" --------");
		System.out.println("|  ���   |");
		System.out.println(" --------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scan.next();
		System.out.print("��ݾ� : ");
		int money = scan.nextInt();
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + account.getBalance());
	}//withdraw ����
	
    //Account �迭���� ano�� ������ Account ��ü ã��
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
    } //findAccount�� ����
}
package Car;

import java.util.Scanner;

public class CarRun {
	int gas = 10;
	String answer;
	
	
	void plusGas() {
		System.out.println("����� �����ҷ� �ȳ��մϴ�.");
		System.out.print("�󸶳� �� �����Ͻðڽ��ϱ�?");
		Scanner scan = new Scanner(System.in);
		int plusgas = scan.nextInt();
		gas += plusgas;		
		System.out.println("������ �Ϸ��߽��ϴ�. \n�ٽ� �����մϴ�.");
		System.out.println("---------------");
		runCheck();
		run();
		
	}
	
	
	void runCheck() {
			if(gas == 0) {
				System.out.println("�ֹ����� �����ϴ�.");
				System.out.println("����ϴ�. gas �ܷ� : (" + gas +  ")");
				return;
			}else if(gas <= 3) {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("�ֹ����� �� ���� �ʾҽ��ϴ�.");
				System.out.println("�����ҷ� ���ðڽ��ϱ�?");
				Scanner scan = new Scanner(System.in);
				answer = scan.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					plusGas();
				} else if ((answer.equalsIgnoreCase("N"))) {
					run();
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				}
			}else {
				System.out.println("�ֹ����� ����մϴ�.");
				System.out.println("������ ���� �ֹ����� " + gas + "�Դϴ�.");
			}	
		}
	
	void run() {
		System.out.println("����մϴ�.");
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�: " + gas + " )");
				gas--;
				
				if(gas <= 3) {
				System.out.println("��� ���߰ڽ��ϴ�. (gas�ܷ�: " + gas + " )");
				runCheck();
				break;
			}
			
			}else {
				System.out.println("����ϴ�. (gas�ܷ�: " + gas + " )");
				return;
			}
		}
	}
}

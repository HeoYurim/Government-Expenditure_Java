package HotelBook;

import java.util.Scanner;

public class HotelBook {

	int[] room = new int[12];
	int leftroom;
	
	void menu() {
		System.out.println("�ȳ��ϼ��� YRȣ���Դϴ�.");
		while(true) {
			System.out.println("-------�޴�-------");
			System.out.println("1. �����ϱ� | 2. ���� ��� | 3. ȣ�� ���� | 99. ����");
			Scanner scan = new Scanner(System.in);
			int selectNum = scan.nextInt();
			if(selectNum == 1) {
				book();
				break;
			}else if(selectNum == 2) {
				bookcancel();
				break;
			}else if(selectNum == 3) {
				roomCheck();
				break;
			}else if(selectNum == 99) {
				System.out.println("�����մϴ�.");
				return;
			}else {
				System.out.println("�ٽ� �������ּ���");
				return;
			}
		}
		
	}
	
	void book() {
		System.out.println("�� ȣ���� �����Ͻðڽ��ϱ�?");
		Scanner scan = new Scanner(System.in);
		int roomnNum = scan.nextInt();
	
		roomCheck();
	
		if(leftroom == 1) {
			System.out.println("�����ص帮�ڽ��ϴ�.");
			//ȸ������ �־ ���� ��
			menu();
		}else if(leftroom == 2) {
			System.out.println("�˼��մϴ�, ���� ����Ϸ� �����Դϴ�.");
			book();
		}
	}
	
	void bookcancel() {
		
	}
	
	void roomCheck() {
		
	}
	
	

}

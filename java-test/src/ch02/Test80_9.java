package ch02;

import java.util.Scanner;

public class Test80_9 {

	public static void main(String[] args) {
	
		int major, liberal, general;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �̼� ���� : ");
		major = scan.nextInt();
		System.out.print("���� �̼� ���� : ");
		liberal = scan.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		general = scan.nextInt();
		
		boolean b = ((major + 
				
				liberal + general) >= 140) && (major >=70) && ((liberal >= 30 && general >=30) || (liberal + general >= 80));
		System.out.println("���������� 70 " + ((major >= 70)? "�̻�" : "����"));
		System.out.println(b ? "��������" : "�����Ұ�");
		
		
		/*	
		int Plus = major + liberal + general;
		
		if(Plus >= 140) {
			if((major >= 70)&&(liberal >=30 && general >=30)) {
				System.out.println("���� ����");
			}
			else if((major >= 70)&&((liberal + general) >= 80)) {
				System.out.println("���� ����");
			}
		}
		else {
			System.out.println("���� �Ұ���");
		} */
		
	}

}

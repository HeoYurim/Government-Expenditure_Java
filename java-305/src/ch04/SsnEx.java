package ch04;

import java.util.Scanner;

public class SsnEx {

	public static void main(String[] args) {

		System.out.print("����� �ֹι�ȣ�� �Է��Ͻÿ�(000000-000000) ->");
		
		Scanner scan = new Scanner(System.in);		
		String regNo = scan.nextLine();
		
		char gender = regNo.charAt(7);  //7��° ���ڸ� �̾ƿͶ� -> 0�����̱� ������ ��ǻ� 8��°��
		 
	//	System.out.println(gender);
		
		/*
		switch(gender) {
		case '1':
			System.out.println("�ѱ� ~1999��� �����Դϴ�.");
			break;
		case '2':
			System.out.println("�ѱ� ~1999��� �����Դϴ�.");
			break;
		case '3':
			System.out.println("�ѱ� 2000���~ �����Դϴ�.");
			break;
		case '4':
			System.out.println("�ѱ� 2000���~ �����Դϴ�.");
			break;
		case '5':
			System.out.println("�ܱ� ~1999��� �����Դϴ�.");
			break;
		case '6':
			System.out.println("�ܱ� ~1999��� �����Դϴ�.");
			break;
		case '7':
			System.out.println("�ܱ� 2000���~ �����Դϴ�.");
			break;
		case '8':
			System.out.println("�ܱ� 2000���~ �����Դϴ�.");
			break;
		}
		*/
		
		switch(gender) {
		case'1' : case'3' : case'5' : case'7':
			System.out.println("����� ���� �Դϴ�.");
			break;
		case'2' : case'4' : case'6' : case'8':
			System.out.println("����� ���� �Դϴ�.");
			break;
		default :
			System.out.println("����� �ܰ��� �Դϴ� ��_��!");
			System.out.println("����� ���� ���ư�����");
		}
		
	}
}

package ch04;

import java.util.Scanner;

public class Ifnum {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		}else if(num % 2 != 0) {
			System.out.println("Ȧ��");
		}else {
			System.out.println("�ý��� ����");
		}

	}

}

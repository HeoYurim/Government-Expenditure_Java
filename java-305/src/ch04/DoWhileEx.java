package ch04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {

		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scan =  new Scanner(System.in);
		
		String inputString; //Ű����� �Է� ���� �� �����
		
		do {
			System.out.print(">>>");
			inputString = scan.nextLine(); //String ���� �Է� �޴´�.
			System.out.println("���۰� : " + inputString);
		}while(!inputString.equals("q"));
		
		System.out.println("---------");
		System.out.println("���α׷� ����");
		System.out.println("---------");
		
	}

}

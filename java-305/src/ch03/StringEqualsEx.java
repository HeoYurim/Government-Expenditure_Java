package ch03;

import java.util.Scanner;

public class StringEqualsEx {

	public static void main(String[] args) {

//		String strval1 = "������";	//�������̶�� String ��ü ����
//		String strval2 = "������";	//���� ��ü�� �־ ������ ���� �ʰ� ����
//		String strval3 = new String("������");	//���ο� ��ü�� ����

		Scanner scan = new Scanner(System.in);
		
		String strval1 = scan.nextLine();
		String strval2 = scan.nextLine();;	//���� ��ü�� �־ ������ ���� �ʰ� ����
		String strval3 = new String(scan.nextLine());;	//���ο� ��ü�� ����

		
		System.out.println(strval1 == strval2);
		System.out.println(strval1 == strval3); //���� �������� �����.
		
		System.out.println("-----------------------");
		System.out.println(strval1.equals(strval2));	//���� ������ �����.
		System.out.println(strval1.equals(strval3));	//���� ������ �����.


	}

}

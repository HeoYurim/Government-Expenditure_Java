package ch4;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {

		int sum = 0; //1~10������ �������� ����
		int totalSum = 0;
		
		//1+(1+2)+(1+2+3).....(1+2+3+...+10)���
		for(int i = 1; i<=10; i++) {
			sum += i;
			totalSum += sum;
		}
		System.out.println(totalSum);
//------------------------------------------------------------
		/*
		//1���� 20���� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ����
		//������ 73
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			if(!(i % 2 == 0 || i % 3 == 0)) { //i%2 !=0 && i%3 !=0
				sum = sum += i;
			}
		}
		System.out.println("1���� 20���� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ " + sum + "�Դϴ�");
		 */
//------------------------------------------------------------
		/*
		//?�� ����� ���ϴ� �ڵ� �ۼ�
		//Ű����� ��� ���� �Է� �޴´�.
		//���� �Է��Ͽ� ����� �Ǵ��Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("� ������� ���Ͻðڽ��ϱ�? -> ");
		int num = scan.nextInt();
		
		System.out.print("� ���ڸ� �Է��Ͻðڽ��ϱ�? ->");
		int input = scan.nextInt();
		
		if(input % num == 0) {
			System.out.println(num + "�� ����Դϴ�.");
		}else {
			System.out.println(num + "�� ����� �ƴմϴ�.");
		}
		System.out.println("�����մϴ�.");
		*/
//------------------------------------------------------------
		/*
		//4�� ����� ���ϴ� �ڵ� �ۼ�
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		if(num % 4 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		System.out.println("����");
		*/
	}

}

package ch04;

import java.util.Scanner;

public class ForSumEx {

	public static void main(String[] args) {

		//1���� 100������ ���� ���غ���. 1+2+3+...+100 = sum
		int sum = 0; //���� �հ踦 ���ϴ� ������ ����
		int i = 1;
		int input;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ���� ���Ͻðڽ��ϱ�? : ");
		input = scan.nextInt();
		
		for(; i <=input; i++) {	//1���� 100���� ������
			sum = sum + i;
		}
		System.out.println("1 ~ " + (i-1) + " ������ �� : " + sum);
	}
}

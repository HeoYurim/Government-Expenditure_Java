package ch02;

import java.util.Scanner;

public class Test80_8 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		num = scan.nextInt();
		
		int sum = 0;
		sum = num %10;
		num/=10;
		sum += num %10;
		num/=10;
		sum += num %10;
		num/=10;
		
		System.out.println("�� �ڸ����� �� = " + sum);
	}

}

package ch2;

import java.util.Scanner;

public class Test80_6 {

	public static void main(String[] args) {

		double F;
		double C;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��ϼ��� : ");
		F = scan.nextDouble();
		
		C = (double)5/9 * (F - 32.0);
		
		System.out.printf("�����µ��� %-4.1f", C);
		
	}

}

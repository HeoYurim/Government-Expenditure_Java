package ch2;

import java.util.Scanner;

public class Test80_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double r, h; //������, ����, ����
		double v;
		System.out.print("������� �ظ� ��������? ");
		r = scan.nextDouble();
		
		System.out.print("������� ���̴�? ");
		h = scan.nextDouble();
		
		v = ((r*r) * 3.14) * h;
		System.out.println("������� ���Ǵ� " + v);
	}

}

package ch2;

//RectangleAreaEx

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {

		double w, h , area; // w = ����, h = ����, area ����
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		w = in.nextDouble();
		
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		h = in.nextDouble();
		
		
		area = (w * h);
		
	//	System.out.printf("���簢���� ���̴� %4.1f �Դϴ�.", area);
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
		
		
	}

}

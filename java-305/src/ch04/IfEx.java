package ch04;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {

		// Scanner ��ü�� �����Ͽ� Ű����� ���� �Է¹޴´�.
		Scanner scan = new Scanner(System.in);

		// Ű����� �Է¹��� ������ score ������ �ִ´�.
		System.out.print("������ ������ �Է��ϼ��� : ");
		int score = scan.nextInt();

		/*
		 * if(score >= 90) { System.out.println("������ 90�� �̻��Դϴ�.");
		 * System.out.println("������ ����� A��� �Դϴ�."); }
		 * 
		 * if(score < 90) { System.out.println("������ 90������ �۽��ϴ�.");
		 * System.out.println("������ ����� B��� �Դϴ�."); }
		 */

		if (score >= 90) { // score ���� 90 �̻��̸�?
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("������ ����� A��� �Դϴ�.");
		} else if (score >= 80) { // score ���� 80 �̻��̸�?
			System.out.println("������ 80�� �̻��Դϴ�.");
			System.out.println("������ ����� B��� �Դϴ�.");
		}else if (score >= 70) { // score ���� 70 �̻��̸�?
			System.out.println("������ 70�� �̻��Դϴ�.");
			System.out.println("������ ����� C��� �Դϴ�.");
		}else if (score >= 60) { // score ���� 60 �̻��̸�?
			System.out.println("������ 60�� �̻��Դϴ�.");
			System.out.println("������ ����� D��� �Դϴ�.");
		}else { // score ���� 60 �̸��̸�?
			System.out.println("������ 60�� �̸��Դϴ�.");
			System.out.println("������ ����� F��� �Դϴ�.");
		}
	}

}

package ch05;

import java.util.Scanner;

public class AdvancedForEx {

	public static void main(String[] args) {

		int sum = 0;
		float average = 0;
		
		Scanner scan = new Scanner(System.in);

		int scores[] = new int[5];
		
		for (int i : scores) {
			System.out.print("������ �Է��ϼ��� : ");
			scores[i] = scan.nextInt();
			sum += scores[i];
			
		}
		System.out.println("���� : " + sum);
		
		
		/*
		int[] scores = {95, 71, 84, 93, 87}; //1���� �迭 ���� �� �� �Է�
		
		int sum = 0;
		for (int i : scores) { //���� for�� i�� ������ �Ǵ� ���� : scores�� �ּҰ�, �ִ밪, ������ ���)
			sum += i; //sum = sum + i
			
		}
		System.out.println("������ ���� : " + sum);
		*/
	}

}

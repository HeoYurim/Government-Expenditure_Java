package ch06;

import java.util.*;

public class ch03_Programming03 {
	
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);

		do {
				System.out.print("���� ������ �Է��ϼ��� : ");
				num = scan.nextInt();
				if(num % 2 ==0) {
					sum = sum += num;
				}else if (num <=0)
	                break;
		}while(true);
		System.out.printf("�Է��� ���� ���� �߿��� ¦���� ���� " + sum);
	}
}

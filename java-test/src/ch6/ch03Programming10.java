package ch6;

import java.util.Scanner;

public class ch03Programming10 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		num = scan.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
	}

	static boolean isPrime(int num) {

		if(num ==1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}


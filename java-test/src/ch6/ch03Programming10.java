package ch6;

import java.util.Scanner;

public class ch03Programming10 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		num = scan.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		}
		else {
			System.out.println(num + "는 소수가 아닙니다.");
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


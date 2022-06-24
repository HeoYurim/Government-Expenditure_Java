package ch04;

import java.util.Scanner;

public class Ifnum {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else if(num % 2 != 0) {
			System.out.println("홀수");
		}else {
			System.out.println("시스템 오류");
		}

	}

}

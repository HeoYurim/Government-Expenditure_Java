package ch02;

import java.util.Scanner;

public class Test80_2 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		System.out.printf("%d의 제곱은 %d\n", num , num*num);
	}

}

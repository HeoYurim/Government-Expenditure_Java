package ch2;

import java.util.Scanner;

public class Test80_7 {

	public static void main(String[] args) {
		
		int num;
		boolean and, or; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		and = (num % 4 == 0)&&(num % 5 ==0);
		or = (num % 4 == 0)||(num % 5 ==0);
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(!and && or);
		
		
	}

}

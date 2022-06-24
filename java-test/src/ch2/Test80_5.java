package ch2;

import java.util.Scanner;

public class Test80_5 {

	public static void main(String[] args) {

//		char c = 'k';
//		System.out.printf("%c\n" , c - ('a' - 'A'));
		
		;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자를 입력하세요 : ");
		
		String str1 = scan.nextLine();
		String c = str1.toUpperCase();
		System.out.println(c);
		
//		char c
//		c = scan.next().charAt(0);		
//		System.out.printf("%c\n" , c - ('a' - 'A'));
		
		
	}

}

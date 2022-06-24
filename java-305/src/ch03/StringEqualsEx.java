package ch03;

import java.util.Scanner;

public class StringEqualsEx {

	public static void main(String[] args) {

//		String strval1 = "허유림";	//허유림이라는 String 객체 생성
//		String strval2 = "허유림";	//같은 객체가 있어서 생성은 하지 않고 참조
//		String strval3 = new String("허유림");	//새로운 객체를 생성

		Scanner scan = new Scanner(System.in);
		
		String strval1 = scan.nextLine();
		String strval2 = scan.nextLine();;	//같은 객체가 있어서 생성은 하지 않고 참조
		String strval3 = new String(scan.nextLine());;	//새로운 객체를 생성

		
		System.out.println(strval1 == strval2);
		System.out.println(strval1 == strval3); //같은 번지인지 물어본다.
		
		System.out.println("-----------------------");
		System.out.println(strval1.equals(strval2));	//값이 같은지 물어본다.
		System.out.println(strval1.equals(strval3));	//값이 같은지 물어본다.


	}

}

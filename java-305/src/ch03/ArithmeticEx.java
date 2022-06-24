package ch03;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {

//		int v1 = 10;
//		int v2 = 4;
//		int result1 = v1 + v2;
//		System.out.println("result1 = " + result1); //int 타입의 7
//		
//		int result2 = v1 - v2;
//		System.out.println("result2 = " + result2); //int 타입의 3
//		
//		int result3 = v1 * v2;
//		System.out.println("result3 = " + result3); //int 타입의 10
//		
//		int result4 = v1 / v2;
//		System.out.println("result4 = " + result4); //int 타입의 2
//		
//		int result5 = v1 % v2;
//		System.out.println("result5 = " + result5); //int 타입의 1
//		
//		double result6 = (double)v1 / v2;
//		System.out.println("result6 = " + result6); //double 타입의 2.5 
//		
		
		int v1, v2;
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("v1의 값은? ");
		v1  = scan.nextInt();
		
		System.out.print("v2의 값은? ");
		v2 = scan.nextInt();
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1); //int 타입의 7
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2); //int 타입의 3
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3); //int 타입의 10
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4); //int 타입의 2
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5); //int 타입의 1
		
		double result6 = (double)v1 / v2;
		System.out.println("result6 = " + result6); //double 타입의 2.5 
		
	}

}

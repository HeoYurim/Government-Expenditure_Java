package ch03;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {

//		int v1 = 10;
//		int v2 = 4;
//		int result1 = v1 + v2;
//		System.out.println("result1 = " + result1); //int Ÿ���� 7
//		
//		int result2 = v1 - v2;
//		System.out.println("result2 = " + result2); //int Ÿ���� 3
//		
//		int result3 = v1 * v2;
//		System.out.println("result3 = " + result3); //int Ÿ���� 10
//		
//		int result4 = v1 / v2;
//		System.out.println("result4 = " + result4); //int Ÿ���� 2
//		
//		int result5 = v1 % v2;
//		System.out.println("result5 = " + result5); //int Ÿ���� 1
//		
//		double result6 = (double)v1 / v2;
//		System.out.println("result6 = " + result6); //double Ÿ���� 2.5 
//		
		
		int v1, v2;
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("v1�� ����? ");
		v1  = scan.nextInt();
		
		System.out.print("v2�� ����? ");
		v2 = scan.nextInt();
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1); //int Ÿ���� 7
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2); //int Ÿ���� 3
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3); //int Ÿ���� 10
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4); //int Ÿ���� 2
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5); //int Ÿ���� 1
		
		double result6 = (double)v1 / v2;
		System.out.println("result6 = " + result6); //double Ÿ���� 2.5 
		
	}

}

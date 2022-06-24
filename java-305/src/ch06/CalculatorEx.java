package ch06;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(10, 20);
		System.out.println("10 + 20 = " + result1);
		
		System.out.println("---------------------");
		
		int x = 40;
		int y = 20;
		int result2 = myCalc.minus(x,y);	
		System.out.println(x + " - " + y + " = " + result2);
		
		System.out.println("---------------------");
		
		//Ű����� ���ڸ� �Է� �޾� ���ϱ⸦ �����ϼ���.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("A ���� �Է��ϼ��� : ");
		int A = scan.nextInt();
		System.out.print("B ���� �Է��ϼ��� : ");
		int B = scan.nextInt();
		int result3 = myCalc.multiply(A,B);	
		System.out.println(A + " * " + B + " = " + result3);
		
		System.out.println("---------------------");
		
		myCalc.powerOff();
	}

}

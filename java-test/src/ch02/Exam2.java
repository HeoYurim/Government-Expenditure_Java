package ch02;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		num = scan.nextInt();
		
//		if(num % 2 == 0) {
//			System.out.println("¦��");
//		}else {
//			System.out.println("Ȧ��");
//		}
		
		System.out.println(num % 2 == 0 ? "¦��" : "Ȧ��");
	}

}

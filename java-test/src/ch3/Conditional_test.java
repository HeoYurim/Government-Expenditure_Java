package ch3;

import java.util.Scanner;

public class Conditional_test {

	public static void main(String[] args) {
		
		int score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		score = scan.nextInt();
		
		if(score >= 95) 
			System.out.println("A+");
		else if(score > 90)
			System.out.println("A");
		else if(score >= 85)
			System.out.println("B+");
		else if(score > 80)
			System.out.println("B");
		else if(score < 85)
			System.out.println("C");
		else
			System.out.println("�ý��� ����");
	}
}

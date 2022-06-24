package ch3;

import java.util.Scanner;

public class Conditional_test {

	public static void main(String[] args) {
		
		int score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 : ");
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
			System.out.println("시스템 오류");
	}
}

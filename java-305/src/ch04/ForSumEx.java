package ch04;

import java.util.Scanner;

public class ForSumEx {

	public static void main(String[] args) {

		//1부터 100까지의 합을 구해본다. 1+2+3+...+100 = sum
		int sum = 0; //누적 합계를 구하는 변수를 선언
		int i = 1;
		int input;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 까지 합을 구하시겠습니까? : ");
		input = scan.nextInt();
		
		for(; i <=input; i++) {	//1부터 100까지 증가값
			sum = sum + i;
		}
		System.out.println("1 ~ " + (i-1) + " 까지의 합 : " + sum);
	}
}

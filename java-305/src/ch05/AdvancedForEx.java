package ch05;

import java.util.Scanner;

public class AdvancedForEx {

	public static void main(String[] args) {

		int sum = 0;
		float average = 0;
		
		Scanner scan = new Scanner(System.in);

		int scores[] = new int[5];
		
		for (int i : scores) {
			System.out.print("정수를 입력하세요 : ");
			scores[i] = scan.nextInt();
			sum += scores[i];
			
		}
		System.out.println("총점 : " + sum);
		
		
		/*
		int[] scores = {95, 71, 84, 93, 87}; //1차원 배열 생성 후 값 입력
		
		int sum = 0;
		for (int i : scores) { //향상된 for문 i는 증가가 되는 변수 : scores는 최소값, 최대값, 증감값 대용)
			sum += i; //sum = sum + i
			
		}
		System.out.println("점수의 총합 : " + sum);
		*/
	}

}

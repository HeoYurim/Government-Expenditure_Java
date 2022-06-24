package ch4;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		int answer = 0;
		int input = 0;
		
		answer = (int)(Math.random() * 31 ) + 1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1과 31사이의 정수를 입력하세요");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("down");
			}else if(input < answer) {
				System.out.println("up");
			}
		}while(input!=answer);
		
		System.out.println("정답입니다." + answer);
		
		

	}

}

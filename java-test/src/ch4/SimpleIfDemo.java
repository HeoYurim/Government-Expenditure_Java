package ch4;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {

		int sum = 0; //1~10까지의 증가값을 저장
		int totalSum = 0;
		
		//1+(1+2)+(1+2+3).....(1+2+3+...+10)계산
		for(int i = 1; i<=10; i++) {
			sum += i;
			totalSum += sum;
		}
		System.out.println(totalSum);
//------------------------------------------------------------
		/*
		//1부터 20까지 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		//정답은 73
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			if(!(i % 2 == 0 || i % 3 == 0)) { //i%2 !=0 && i%3 !=0
				sum = sum += i;
			}
		}
		System.out.println("1부터 20까지 정수 중에서 2 또는 3의 배수가 아닌 수의 총합은 " + sum + "입니다");
		 */
//------------------------------------------------------------
		/*
		//?의 배수를 구하는 코드 작성
		//키보드로 배수 값을 입력 받는다.
		//값을 입력하여 배수를 판단한다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("어떤 배수인지 구하시겠습니까? -> ");
		int num = scan.nextInt();
		
		System.out.print("어떤 숫자를 입력하시겠습니까? ->");
		int input = scan.nextInt();
		
		if(input % num == 0) {
			System.out.println(num + "의 배수입니다.");
		}else {
			System.out.println(num + "의 배수가 아닙니다.");
		}
		System.out.println("종료합니다.");
		*/
//------------------------------------------------------------
		/*
		//4의 배수를 구하는 코드 작성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num % 4 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("종료");
		*/
	}

}

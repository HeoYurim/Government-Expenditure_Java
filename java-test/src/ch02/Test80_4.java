package ch02;

import java.util.Scanner;

public class Test80_4 {

	public static void main(String[] args) {
		
		int second,time,hour, min;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요. : ");
		time = scan.nextInt();
		
		hour = (time/60) / 60;
		min = (time/60) % 60;
		second = time % 60;
		
		System.out.printf("%d시간 %d분 %d초 \n" , hour, min, second);
		
	}

}

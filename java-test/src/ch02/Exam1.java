package ch02;

//RectangleAreaEx

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {

		double w, h , area; // w = 가로, h = 세로, area 넓이
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		
		
		area = (w * h);
		
	//	System.out.printf("직사각형의 넓이는 %4.1f 입니다.", area);
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		
		
	}

}

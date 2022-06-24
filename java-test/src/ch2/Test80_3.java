package ch2;

import java.util.Scanner;

public class Test80_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double r, h; //반지름, 높이, 부피
		double v;
		System.out.print("원기둥의 밑면 반지름은? ");
		r = scan.nextDouble();
		
		System.out.print("원기둥의 높이는? ");
		h = scan.nextDouble();
		
		v = ((r*r) * 3.14) * h;
		System.out.println("원기둥의 부피는 " + v);
	}

}

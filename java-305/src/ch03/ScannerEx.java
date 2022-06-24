package ch03;

import java.util.Scanner;	//외부에 있는 것을 가져와서 쓸 때 사용

public class ScannerEx {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);   //C+S+O
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.printf("%d * %d은 %d입니다. \n" , x , y , x*y);
		
	}

}

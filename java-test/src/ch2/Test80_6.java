package ch2;

import java.util.Scanner;

public class Test80_6 {

	public static void main(String[] args) {

		double F;
		double C;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		F = scan.nextDouble();
		
		C = (double)5/9 * (F - 32.0);
		
		System.out.printf("¼·¾¾¿Âµµ´Â %-4.1f", C);
		
	}

}

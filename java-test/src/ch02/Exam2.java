package ch02;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		num = scan.nextInt();
		
//		if(num % 2 == 0) {
//			System.out.println("Â¦¼ö");
//		}else {
//			System.out.println("È¦¼ö");
//		}
		
		System.out.println(num % 2 == 0 ? "Â¦¼ö" : "È¦¼ö");
	}

}

package ch9;

import java.util.*;

public class ThrowsDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			squre(in.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}
				
	}

	private static void squre(String s) throws NumberFormatException {
		
		int n = Integer.parseInt(s);
		System.out.println(n * n);;
		
	}
}

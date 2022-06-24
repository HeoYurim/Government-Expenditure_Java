package ch6;

import java.util.*;

public class ch03_num3 {

	public static void main(String[] args) {
		
		int result;

		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));

	}

	static int factorial(int x) {
		int r = 1;
		
		while(true) {
			for(int i = 1; i <= x; i++) {
				r = r * i;
			}
			break;
		}
		return r;
	}
	
	static int factorial(int x, int y) {
		int r = 1;
		
		while(true) {
			for(int i = x; i <= y; i++) {
				r = r * i;
			}
			break;
		}
		return r;
	}

}

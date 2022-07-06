package ch06;

import java.util.*;

public class ch03_num2 {

	public static void main(String[] args) {
		int n;
		int result;

		Scanner scan = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = scan.nextInt();
		
		result = factorial(n);
		System.out.println(result);
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

}

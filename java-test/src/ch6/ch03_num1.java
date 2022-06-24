package ch6;

import java.util.*;

public class ch03_num1 {

	public static void main(String[] args) {
		
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		result = 1;
		while(true) {
			for(int i = 1; i <= n; i++) {
				result = result * i;
			}
			break;
		}
		
		/*
		result = 1;
		while(n > 0) {
			for(int i = 1; i <= n; i++) {
				result = result * i;
			}
			break;
		}
		*/
		System.out.println(result);
		
	}
		
}

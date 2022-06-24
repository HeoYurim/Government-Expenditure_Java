package ch6;

import java.util.*;

public class ch03_Programming01 {

	public static void main(String[] args) {

		int age; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		
		if(age > 19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
		
	}

}

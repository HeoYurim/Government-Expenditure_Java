package ch4;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		int answer = 0;
		int input = 0;
		
		answer = (int)(Math.random() * 31 ) + 1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1�� 31������ ������ �Է��ϼ���");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("down");
			}else if(input < answer) {
				System.out.println("up");
			}
		}while(input!=answer);
		
		System.out.println("�����Դϴ�." + answer);
		
		

	}

}

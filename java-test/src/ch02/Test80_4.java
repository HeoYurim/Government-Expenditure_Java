package ch02;

import java.util.Scanner;

public class Test80_4 {

	public static void main(String[] args) {
		
		int second,time,hour, min;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ���. : ");
		time = scan.nextInt();
		
		hour = (time/60) / 60;
		min = (time/60) % 60;
		second = time % 60;
		
		System.out.printf("%d�ð� %d�� %d�� \n" , hour, min, second);
		
	}

}

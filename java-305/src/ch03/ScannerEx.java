package ch03;

import java.util.Scanner;	//�ܺο� �ִ� ���� �����ͼ� �� �� ���

public class ScannerEx {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);   //C+S+O
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.printf("%d * %d�� %d�Դϴ�. \n" , x , y , x*y);
		
	}

}

package ch6;

import java.util.*;

public class ch03_Programming01 {

	public static void main(String[] args) {

		int age; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		age = scan.nextInt();
		
		if(age > 19) {
			System.out.println("����");
		}else {
			System.out.println("�̼���");
		}
		
	}

}

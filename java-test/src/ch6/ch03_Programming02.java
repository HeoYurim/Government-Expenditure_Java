package ch6;

import java.util.*;

public class ch03_Programming02 {

	public static void main(String[] args) {

		String num; //���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���(_��) : ");
		num = scan.nextLine();
		
		number(num);
		
		
		
	}

	static void number(String num) {
		
		String kind ="...";
		
		switch(num) {
		case "1��" ->
			System.out.println("���� ���߽��ϴ�.");
		case "2��","3��"->
			System.out.println("���߽��ϴ�.");
		case "4��","5��","6��" ->
			System.out.println("�����Դϴ�.");
		default ->
			System.out.println("����ؾ߰ڽ��ϴ�.");
		}
	}

}

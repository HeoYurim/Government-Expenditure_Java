package ch06;

import java.util.Scanner;

public class ch03Programming06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("ö�� : ");
		String x = scan.nextLine();
		
		System.out.print("���� : ");
		String y = scan.nextLine();
		
		if((x.equals("s") && y.equals("s"))||(x.equals("r") && y.equals("r"))||(x.equals("p") && y.equals("p"))) {
			System.out.println("�����ϴ�");
		}
		else if((x.equals("s") && y.equals("p"))||(x.equals("r") && y.equals("s"))||(x.equals("p") && y.equals("r"))) {
			System.out.println("ö��, ��!");
		}
		else {
			System.out.println("����, ��!");
		}
	}

}

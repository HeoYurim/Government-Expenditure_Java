package ch06;

import java.util.Scanner;

public class ch03Programming07 {

	public static void main(String[] args) {

		String c = input("ö��");
		String y = input("����");
		whosWin(c,y);
		
	}

	// �̸��� �޴� �޼ҵ�
	static String input(String n) {
		String input;
        Scanner scan = new Scanner(System.in);
        System.out.printf("%s : ", n);
        input = scan.next();

        return input;
	}

	static void whosWin(String c, String y) {
		
		if((c.equals("s") && y.equals("s"))||(c.equals("r") && y.equals("r"))||(c.equals("p") && y.equals("p"))) {
			System.out.println("�����ϴ�");
		}
		else if((c.equals("s") && y.equals("p"))||(c.equals("r") && y.equals("s"))||(c.equals("p") && y.equals("r"))) {
			System.out.println("ö��, ��!");
		}
		else {
			System.out.println("����, ��!");
		}
		
	}

}

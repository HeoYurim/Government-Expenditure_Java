package ch06;

import java.util.Scanner;

public class ch03Programming07 {

	public static void main(String[] args) {

		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		whosWin(c,y);
		
	}

	// ÀÌ¸§À» ¹Þ´Â ¸Þ¼Òµå
	static String input(String n) {
		String input;
        Scanner scan = new Scanner(System.in);
        System.out.printf("%s : ", n);
        input = scan.next();

        return input;
	}

	static void whosWin(String c, String y) {
		
		if((c.equals("s") && y.equals("s"))||(c.equals("r") && y.equals("r"))||(c.equals("p") && y.equals("p"))) {
			System.out.println("ºñ°å½À´Ï´Ù");
		}
		else if((c.equals("s") && y.equals("p"))||(c.equals("r") && y.equals("s"))||(c.equals("p") && y.equals("r"))) {
			System.out.println("Ã¶¼ö, ½Â!");
		}
		else {
			System.out.println("¿µÈñ, ½Â!");
		}
		
	}

}

package ch6;

import java.util.*;

public class ch03_Programming02 {

	public static void main(String[] args) {

		String num; //등수
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등수를 입력하세요(_등) : ");
		num = scan.nextLine();
		
		number(num);
		
		
		
	}

	static void number(String num) {
		
		String kind ="...";
		
		switch(num) {
		case "1등" ->
			System.out.println("아주 잘했습니다.");
		case "2등","3등"->
			System.out.println("잘했습니다.");
		case "4등","5등","6등" ->
			System.out.println("보통입니다.");
		default ->
			System.out.println("노력해야겠습니다.");
		}
	}

}

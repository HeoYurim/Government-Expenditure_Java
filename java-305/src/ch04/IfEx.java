package ch04;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {

		// Scanner 객체를 생성하여 키보드로 값을 입력받는다.
		Scanner scan = new Scanner(System.in);

		// 키보드로 입력받은 정수를 score 변수에 넣는다.
		System.out.print("귀하의 점수를 입력하세요 : ");
		int score = scan.nextInt();

		/*
		 * if(score >= 90) { System.out.println("점수가 90점 이상입니다.");
		 * System.out.println("귀하의 등급은 A등급 입니다."); }
		 * 
		 * if(score < 90) { System.out.println("점수가 90점보다 작습니다.");
		 * System.out.println("귀하의 등급은 B등급 입니다."); }
		 */

		if (score >= 90) { // score 값이 90 이상이면?
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("귀하의 등급은 A등급 입니다.");
		} else if (score >= 80) { // score 값이 80 이상이면?
			System.out.println("점수가 80점 이상입니다.");
			System.out.println("귀하의 등급은 B등급 입니다.");
		}else if (score >= 70) { // score 값이 70 이상이면?
			System.out.println("점수가 70점 이상입니다.");
			System.out.println("귀하의 등급은 C등급 입니다.");
		}else if (score >= 60) { // score 값이 60 이상이면?
			System.out.println("점수가 60점 이상입니다.");
			System.out.println("귀하의 등급은 D등급 입니다.");
		}else { // score 값이 60 미만이면?
			System.out.println("점수가 60점 미만입니다.");
			System.out.println("귀하의 등급은 F등급 입니다.");
		}
	}

}

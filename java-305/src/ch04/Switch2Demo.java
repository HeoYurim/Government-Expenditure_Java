package ch04;

import java.util.Scanner;

public class Switch2Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("동물,생물을 입력하세요 : ");
		String name = scan.nextLine();
		whoIsIt(name);
		
		/*
		whoISIt("호랑이"); //내가 만든 함수(메서드)에 호랑이 값을 넣는다.
		whoISIt("참새");
		whoISIt("고등어");
		whoISIt("곰팡이");*/
		
	}//main 메서드의 종료 괄호

	static void whoIsIt(String bio) {

		String kind ="미지의 생물";
		switch(bio) {
		case "호랑이","사자","강아지","고양이" -> kind ="포유류";
			
		case "독수리","참새","까마귀","비둘기" ->kind ="조류";
			
		case "고등어","연어","참치","갈치" ->kind ="어류";
			
		default-> System.out.println("어이쿠");
		}
		System.out.printf("%s는 %s이다.\n", bio, kind);
		
		/*
		String kind ="";
		switch(bio) {
		case "호랑이":
		case "사자":
		case "강아지":
		case "고양이":
			kind ="포유류";
			break;
		case "독수리":
		case "참새":
		case "까마귀":
		case "비둘기":
			kind ="조류";
			break;
		case "고등어":
		case "연어":
		case "참치":
		case "갈치":
			kind ="어류";
			break;
		default:
			System.out.println("어이쿠");
			kind ="다시 입력하세요";
		}
		System.out.printf("%s는 %s이다.\n", bio, kind);
		*/
	}

}

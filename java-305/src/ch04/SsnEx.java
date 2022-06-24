package ch04;

import java.util.Scanner;

public class SsnEx {

	public static void main(String[] args) {

		System.out.print("당신의 주민번호를 입력하시오(000000-000000) ->");
		
		Scanner scan = new Scanner(System.in);		
		String regNo = scan.nextLine();
		
		char gender = regNo.charAt(7);  //7번째 글자를 뽑아와라 -> 0부터이기 때문에 사실상 8번째임
		 
	//	System.out.println(gender);
		
		/*
		switch(gender) {
		case '1':
			System.out.println("한국 ~1999년생 남성입니다.");
			break;
		case '2':
			System.out.println("한국 ~1999년생 여성입니다.");
			break;
		case '3':
			System.out.println("한국 2000년생~ 남성입니다.");
			break;
		case '4':
			System.out.println("한국 2000년생~ 여성입니다.");
			break;
		case '5':
			System.out.println("외국 ~1999년생 남성입니다.");
			break;
		case '6':
			System.out.println("외국 ~1999년생 여성입니다.");
			break;
		case '7':
			System.out.println("외국 2000년생~ 남성입니다.");
			break;
		case '8':
			System.out.println("외국 2000년생~ 여성입니다.");
			break;
		}
		*/
		
		switch(gender) {
		case'1' : case'3' : case'5' : case'7':
			System.out.println("당신은 남자 입니다.");
			break;
		case'2' : case'4' : case'6' : case'8':
			System.out.println("당신은 여자 입니다.");
			break;
		default :
			System.out.println("당신은 외계인 입니다 ㅇ_ㅇ!");
			System.out.println("당신의 별로 돌아가세욥");
		}
		
	}
}

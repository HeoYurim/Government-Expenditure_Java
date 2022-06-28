package ch11.trimtest;

import java.util.*;

public class TrimEx {

	public static void main(String[] args) {
		
		String tel1 = "  010  ";
		String tel2 = "  1234  ";
		String tel3 = " 5678     ";
		
		String tel = tel1.trim() + ")" + tel2.trim() + "-"  + tel3.trim() ;
		
		System.out.println("귀하의 전화번호는 : " + tel);
		
		System.out.println("----------------");
		
		//정수를 문자열로 변환
		String str1 = String.valueOf(10);
		//실수를 문자열로 변환
		String str2 = String.valueOf(10.5);
		//참 값을 문자열로 변환
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("----------------");
		
		String text = "이진희&권수진,전민,윤용-최영광";
		
		String[] names = text.split("&|,|-"); //&이거나 ,이거나 -
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("----------------");

		String text1 = "이진영/김강산/도정수/전한빛/노우섭";
		
		StringTokenizer st1 = new StringTokenizer(text1, "/");
		
		while(st1.hasMoreTokens()) { //hasMoreTokens() 남아 있는 토큰 여부
			String token = st1.nextToken();
			System.out.println(token);		
		}
		System.out.println();
		
		/*
		//how1 : 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text1, "/");
		
		//countTokens() 꺼내지 않고 남아있는 토큰 수
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			//nextToken() 토큰을 하나씩 꺼내옴
			String token = st.nextToken();
			System.out.println(token);
		}
		*/
	}

}

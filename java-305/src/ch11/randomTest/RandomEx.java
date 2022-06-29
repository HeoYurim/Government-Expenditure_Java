package ch11.randomTest;

import java.text.*;
import java.util.*;

public class RandomEx {
	
	public static void main(String[] args) {
		//선택 번호
		//선택번호 6개가 저장될 배열 생성
		int[] selectNumber = new int[6];
		
		Random random = new Random(4);
		
		System.out.print("선택번호 : ");
		
		for(int i = 0; i < 6; i++) {
			//선택 번호를 얻어서 배열에 저장
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호 생성
		int[] winningNumber = new int[6];
		random = new Random(6);
		System.out.print("당첨번호 : ");
		
		for(int i = 0; i < 6; i++) {
			//선택 번호를 얻어서 배열에 저장
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부 분석
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber); //배열 비교 전에 오름차순 정렬
		
		//배열 항목 비교로 true/false가 나온다.
		boolean result =  Arrays.equals(selectNumber, winningNumber);
		
		if(result) {
			System.out.println("1등에 당첨 되셨습니다.");
		}else {
			System.out.println("다음엔 당첨 되실겁니다.");
		}
		
		Date now = new Date();
		String str1Now1 = now.toString();
		System.out.println(now);
		System.out.println(str1Now1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}

package ch11.patternTest;

import java.util.regex.*;

public class PatternEx {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		//(02|010) 02이거나 010으로 입력 검증
		// - 는 있어야 함
		// \\d{3,4} \\d는 \울 입력하기 위해서 두 번 작성 3~4개 숫자 검증
		// \\d{4} 무조건 4개의 숫자 검증
		String data = "010-123-4567";
		
		//Pattern.matches(정규식, 검증할 문자열)
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// \\w+ 한 개 이상의 알파벳 또는 숫자
		// \\. 한 개 이상의 알파벡 또는 숫자 뒤에 . 검증
		// (\\.\\w+)? 한번 더 올 수 있음 -> id@naver.com / id@kkw.or.kr
		data = "angel@kkk.or.kr";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}

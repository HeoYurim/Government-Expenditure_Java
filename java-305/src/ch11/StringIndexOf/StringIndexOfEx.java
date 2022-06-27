package ch11.StringIndexOf;

public class StringIndexOfEx {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
			System.out.println("숫자 13글자로 입력해주세요.");
		}
		
		System.out.println("-------------------");
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		System.out.println("-------------------");
		String ssn1 = "880815-1234567";
		
		String firstNum = ssn1.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn1.substring(7);
		System.out.println(secondNum);
		
		String str1 = "Java programming";
		String str2 = "JAVA programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		//equals 메소드는 문자 내용의 일치(대소문자 구별)
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase 문제 내용의 일치(대소문자 구별 안함)
	}

}

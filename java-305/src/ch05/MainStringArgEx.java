package ch05;

public class MainStringArgEx {

	public static void main(String[] args) {

		if(args.length != 2) { //args에 입력값이 2개인지 검증하는 코드
			System.out.println("프로그램 사용법");
			System.out.println("Java MainStringArgEx num1 num2");
			System.exit(0);	//프로그램 강제 종료
		}
		String strNum1 = args[0];	//String에 첫번째 값을 strNum1에 넣는다.
		String strNum2 = args[1];	//String에 두번째 값을 strNum2에 넣는다.
		
		int num1 = Integer.parseInt(strNum1);	//문자로 받은 숫자를 정수형으로 변환한다.
		int num2 = Integer.parseInt(strNum2);	//문자로 받은 숫자를 정수형으로 변환한다.

		int result = num1 + num2;	//숫자 2개를 더해서 result로 반환
		System.out.println(num1 + " + " + num2 + " = "  + result);
	}

}

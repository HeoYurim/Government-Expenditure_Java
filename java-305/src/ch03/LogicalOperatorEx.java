package ch03;

public class LogicalOperatorEx {

	public static void main(String[] args) {

		int charCode = '7';
		
		if((charCode >= 65) & (charCode <= 90)) {	//유니코드 표에 65~90 사이 값이 대문자.
			System.out.println("대문자입니다. → " + charCode);
		}
		
		if((charCode >= 97) && (charCode <= 122)) {	//유니코드 표에 97~122사이 값이 소문자
			System.out.println("소문자입니다. → " + charCode);
		}
		
		//유니코드 표에 숫자는 47~57에 있다.
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9사이의 숫자입니다. → " + charCode);
		}
		
		int value = 8;
		
		if((value % 2 == 0 | (value % 3 == 0))) {
			System.out.println("2 또는 3의 배수 입니다. → " + value);
		}
		
		if((value % 2 == 0 && (value % 3 == 0))) {
			System.out.println("2의 배수이고 3의 배수 입니다. → " + value);
		}
		
	}

}

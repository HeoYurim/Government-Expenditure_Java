package ch02;

public class FromIntToFloat {

	public static void main(String[] args) {

		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3; //부동소수점 계산은 값의 오류가 있다.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}

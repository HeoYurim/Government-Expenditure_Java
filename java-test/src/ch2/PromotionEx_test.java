package ch2;

public class PromotionEx_test {

	public static void main(String[] args) {

		//byte값이 주어졌을 때 int 값으로 자동변환하여 int 값 출력
		byte byteValue = 55;
		int intValue = (int)byteValue;
		System.out.println(byteValue);
		
		//char값이 주어졌을 때 값의 유니코드를 출력
		char charValue = '희';
		intValue = charValue;
		System.out.println("'희'의 유니코드 값은 = " + intValue);
		
		//int값이 주어졌을 때 long 값 출력
		intValue = 300;
		long longValue = (long)intValue;
		System.out.println(longValue);
		
		//int값이 주어졌을 때 double값 출력
		intValue = 200;
		double doubleValue = (double)intValue;
		System.out.println(doubleValue);
		
	}

}

package ch02;

public class CastingEx {

	public static void main(String[] args) {

		int intValue = 100;
		byte byteValue = (byte)intValue;  //int(4byte) -> byte(1byte) ����Ÿ�Ժ�ȯ
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		intValue = 44032;
		char charValue = (char)intValue; //int(4byte) -> char(2byte) ����Ÿ�Ժ�ȯ
		System.out.println(charValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue; //double(8byte) -> int(4type) ����Ÿ�Ժ�ȯ
		System.out.println(intValue);

		
	}

}

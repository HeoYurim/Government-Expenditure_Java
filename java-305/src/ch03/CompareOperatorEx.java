package ch03;

public class CompareOperatorEx {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); 	//같은지 검사
		boolean result2 = (num1 != num2); 	//다른지 검사
		boolean result3 = (num1 <= num2); 	//num1이 이하인지 검사
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " +result2);
		System.out.println("result3 = " +result3);
		
		System.out.println("-------------------");
		
		char char1 = 'A'; //int 65값
		char char2 = 'B'; //int 66값
		boolean result4 = (char1 < char2); //true
		System.out.println("result4 = " +result4);
	}

}

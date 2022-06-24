package ch06;

public class CalculatorOverloadingEx {

	public static void main(String[] args) {

		CalculatorOverloading myCalc = new CalculatorOverloading();
		
		//정사각형
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형
		double result2 = myCalc.areaRectangle(10, 20);
		
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		
		/*(1)
		int intResult = myCalc.plus(10,20);
		System.out.println("정수 더하기 값 결과 : " + intResult);
		
		double doubleResult = myCalc.plus(10.5, 11.4);
		System.out.println("실수 더하기 값 결과 : " + doubleResult);
		*/
	}

}

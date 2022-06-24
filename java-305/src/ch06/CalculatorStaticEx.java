package ch06;

public class CalculatorStaticEx {

	public static void main(String[] args) {

	//	CalculatorStatic myCalc = new CalculatorStatic();
		double result1 = 10 * 10 * CalculatorStatic.pi;	
		int result2 = CalculatorStatic.plus(10, 20);
		int result3 = CalculatorStatic.minus(50, 30);
		
		/*
		CalculatorStatic myCalc = new CalculatorStatic();
		double result1 = 10 * 10 * CalculatorStatic.pi;	
		int result2 = myCalc.plus(10, 20);
		int result3 = myCalc.minus(50, 30);
		*/
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}

}

package ch06;

public class CalculatorOverloadingEx {

	public static void main(String[] args) {

		CalculatorOverloading myCalc = new CalculatorOverloading();
		
		//���簢��
		double result1 = myCalc.areaRectangle(10);
		
		//���簢��
		double result2 = myCalc.areaRectangle(10, 20);
		
		
		System.out.println("���簢���� ���� : " + result1);
		System.out.println("���簢���� ���� : " + result2);
		
		/*(1)
		int intResult = myCalc.plus(10,20);
		System.out.println("���� ���ϱ� �� ��� : " + intResult);
		
		double doubleResult = myCalc.plus(10.5, 11.4);
		System.out.println("�Ǽ� ���ϱ� �� ��� : " + doubleResult);
		*/
	}

}

package ch06;

public class CalculatorStatic {

	static double pi; //pi 필드 선언 및 초기값 입력
	
	static int plus(int x, int y) { //plus 메소드 생성 후 x + y 값 리턴
		return x +  y;
	}
	
	static int minus(int x, int y) { //minus 메소드 생성 후 x - y 값 리턴
		return x - y;
	}
}

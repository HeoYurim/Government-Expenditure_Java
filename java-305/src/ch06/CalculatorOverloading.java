package ch06;

public class CalculatorOverloading {
	
	double areaRectangle(double width) {
		return width * width;
	} //정사각형의 넓이(가로,세로의 길이가 같아 1개만 받음)
	
	double areaRectangle(double width, double height) {
		return width * height;
	} //직사각형의 넓이(가로, 세로의 길이가 달라 2개 받음)
	
	
	/* (1)
	//메소드 오버로딩 실습
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} //정수의 값을 입력 받아 정수로 리턴한다.
	
	double plus(double x, double y) {
		double result = x + y;
		return result;
	} //실수값을 입력 받아 실수값으로 리턴한다.
	*/
	
}

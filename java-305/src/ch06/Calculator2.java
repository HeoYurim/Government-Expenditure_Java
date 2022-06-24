package ch06;

public class Calculator2 {
	
	//메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} //x와 y의 매개값을 전달 받아 더한 뒤 리턴 해라.
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	} //plus에 있는 x와 y의 더한 매개값을 sum으로 전달 받아 2로 나눈 후 리턴
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	} // avg에 있는 x값을 7, y값을 10으로 받아 println에 있는 message로 프린트 한다.
	
	void println(String message) {
		System.out.println(message);
	} //message를 프린트 한다.
}

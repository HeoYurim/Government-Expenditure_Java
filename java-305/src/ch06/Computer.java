package ch06;

public class Computer {

	int sum1(int[] values) { //배열을 만들어서 계산 후 리턴
		int sum = 0; //합계 누적 값
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { //매개 값을 확인하여 배열 생성
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int plus(int x, int y) {
		int result = x + y; //int 타입이 결과 리턴
		return result;
	}
	
	int plus1(int x, int y) {
		byte result = (byte) (x+y); //강제 타입 변환 후 리턴
		return result;
//		System.out.println("결과값을 리턴한다"); //실행되지 않음
		//Unreachable code (실행할 수 없는 코드)
	}
	
	int gas = 0;
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			System.out.println("충전하세요.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		System.out.println("현재 gas의 잔량은 " + gas + " 입니다.");
		return true;
	}
	
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. gas 잔량: " + gas + ")");
				gas -= 1; //gas = gas - 1
			}
			else {
				System.out.println("멈춥니다. gas 잔량: " + gas + ")");
				return; //run()메소드 종료 -> break문 사용해도 된다.
			}
		}
	}
}

package ch12.ThreadCalc;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		//공유 객체인 calculator에 100을 저장
		calculator.setMemory(100);
	}
	
	
}

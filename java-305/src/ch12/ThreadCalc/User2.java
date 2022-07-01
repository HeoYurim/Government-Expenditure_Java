package ch12.ThreadCalc;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		//공유 객체인 calculator에 50을 저장
		calculator.setMemory(50);
	}
	
	
}

package ch12.ThreadCalc;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		//���� ��ü�� calculator�� 100�� ����
		calculator.setMemory(100);
	}
	
	
}

package ch12.ThreadCalc;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		//���� ��ü�� calculator�� 50�� ����
		calculator.setMemory(50);
	}
	
	
}

package ch06;

public class Computer {

	int sum1(int[] values) { //�迭�� ���� ��� �� ����
		int sum = 0; //�հ� ���� ��
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { //�Ű� ���� Ȯ���Ͽ� �迭 ����
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int plus(int x, int y) {
		int result = x + y; //int Ÿ���� ��� ����
		return result;
	}
	
	int plus1(int x, int y) {
		byte result = (byte) (x+y); //���� Ÿ�� ��ȯ �� ����
		return result;
//		System.out.println("������� �����Ѵ�"); //������� ����
		//Unreachable code (������ �� ���� �ڵ�)
	}
	
	int gas = 0;
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			System.out.println("�����ϼ���.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		System.out.println("���� gas�� �ܷ��� " + gas + " �Դϴ�.");
		return true;
	}
	
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. gas �ܷ�: " + gas + ")");
				gas -= 1; //gas = gas - 1
			}
			else {
				System.out.println("����ϴ�. gas �ܷ�: " + gas + ")");
				return; //run()�޼ҵ� ���� -> break�� ����ص� �ȴ�.
			}
		}
	}
}

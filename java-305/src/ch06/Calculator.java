package ch06;

public class Calculator { //���� ���α׷�
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ ������ �մϴ�.");
	}
	
	int plus(int x, int y) { //����
		int result = x + y;
		return result;
	}
	int minus(int x, int y) { //����
		int result = x - y;
		return result;
	}
	int multiply(int x, int y) { //����
		int result = x * y;
		return result;
	}
	double divide(int x, int y) { //������
		double result = (double)x /(double) y;
		return result;
	} 
	int reminder(int x, int y) { //������
		int result = x % y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ������ ���ϴ�.");
	}
}

package ch06;

public class Calculator2 {
	
	//�޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} //x�� y�� �Ű����� ���� �޾� ���� �� ���� �ض�.
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	} //plus�� �ִ� x�� y�� ���� �Ű����� sum���� ���� �޾� 2�� ���� �� ����
	
	void execute() {
		double result = avg(7, 10);
		println("������ : " + result);
	} // avg�� �ִ� x���� 7, y���� 10���� �޾� println�� �ִ� message�� ����Ʈ �Ѵ�.
	
	void println(String message) {
		System.out.println(message);
	} //message�� ����Ʈ �Ѵ�.
}

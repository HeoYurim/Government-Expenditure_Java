package ch06;

public class CalculatorOverloading {
	
	double areaRectangle(double width) {
		return width * width;
	} //���簢���� ����(����,������ ���̰� ���� 1���� ����)
	
	double areaRectangle(double width, double height) {
		return width * height;
	} //���簢���� ����(����, ������ ���̰� �޶� 2�� ����)
	
	
	/* (1)
	//�޼ҵ� �����ε� �ǽ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} //������ ���� �Է� �޾� ������ �����Ѵ�.
	
	double plus(double x, double y) {
		double result = x + y;
		return result;
	} //�Ǽ����� �Է� �޾� �Ǽ������� �����Ѵ�.
	*/
	
}

package ch07.extended.overraid;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		
		return super.areaCircle(r); //�� ���� �����Ͽ� ����
		
	} //�ڽ�Ŭ����
	
	
	
	
	/*
	@Override //������̼� : �ڵ� �� �ۼ����� �ɾ����ִ� ���� ����
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	} //�޼ҵ� �������̵� ����
	*/
}
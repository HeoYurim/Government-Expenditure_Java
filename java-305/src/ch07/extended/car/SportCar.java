package ch07.extended.car;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	} //������ī�� �ӵ��� 10�� �����Ѵ�.
	
	
	
	/*
	@Override
	public void Stop() {
		System.out.println("������ī ����");
		speed = 0;
	}//final �޼ҵ�� �������̵��� �ȵȴ�
	*/
}

package ch06.getter_setter;

public class CarEx {

	public static void main(String[] args) {

		Car2 myCar = new Car2();
		
//		myCar.speed = -50;
		
		//�߸��� �ӵ��� ����
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ��� : " + myCar.getSpeed());
		
		//���� ������ ���� setter
		//���� ���� ���� getter
		
		//���� �ӵ� Ȯ��
		myCar.setSpeed(60);
		System.out.println("���� �ӵ��� : " + myCar.getSpeed());
		
		//���� �׽�Ʈ
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� ���� ���� : " + myCar.getSpeed());
	}
}

package ch7.tire;

public class hankookTire extends Tire{
	
	//�ʵ�� �θ� �ʵ� �̿�
	
	//������
	public hankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation; //1������
		if(accRotation < maxRotation) {
			System.out.println(location + " �ѱ� Ÿ�̾� ���� : " + (maxRotation - accRotation)+ "���ϸ���");
			return true;
		}else {
			System.out.println("!!!!! ��� : " + location + " �ѱ� Ÿ�̾� ��ũ !!!!!");
			return false;
		}
	}
	
}

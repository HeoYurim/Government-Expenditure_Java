package ch07.promotion.tire;

public class hankookTire extends Tire{

	//�ʵ�� �θ� �ʵ� Ȱ��
	
	//������
	public hankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�������̵� �޼ҵ�
	@Override
	public boolean roll() {
		++accRotation; //���� ȸ���� 1�� ����
		if(accRotation < maxRotation) {
			System.out.println(location + "�ѱ�Ÿ�̾� ���� : " + (maxRotation - accRotation) + "���ϸ���");
			return true; //���� ���� �ڵ�
		}else {
			System.out.println("****��� : " + location + "�ѱ�Ÿ�̾� ��ũ****");
			return false; //���� �Ұ��� �ڵ�
		}
	}	
}

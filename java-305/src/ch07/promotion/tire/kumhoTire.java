package ch07.promotion.tire;

public class kumhoTire extends Tire{

	//�ʵ�� �θ� �ʵ� Ȱ��
	
	//������
	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�������̵� �޼ҵ�
	@Override
	public boolean roll() {
		++accRotation; //���� ȸ���� 1�� ����
		if(accRotation < maxRotation) {
			System.out.println(location + "��ȣŸ�̾� ���� : " + (maxRotation - accRotation) + "���ϸ���");
			return true; //���� ���� �ڵ�
		}else {
			System.out.println("****��� : " + location + "��ȣŸ�̾� ��ũ****");
			return false; //���� �Ұ��� �ڵ�
		}
	}	
}

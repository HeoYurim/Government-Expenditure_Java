package ch07.promotion.tire;

public class Tire { //�θ� Ŭ����, �ֻ���
	
	//�ʵ�
	public int maxRotation; //�ִ� ȸ����(Ÿ�̾� ����)
	public int accRotation; //���� ȸ����(1�� ����)
	public String location; //Ÿ�̾��� ��ġ
	
	//������
	public Tire( String location, int maxRotation) {
		
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accRotation; //���� ȸ���� 1�� ����
		if(accRotation < maxRotation) {
			System.out.println(location + "Ÿ�̾� ���� : " + (maxRotation - accRotation) + "���ϸ���");
			return true; //���� ���� �ڵ�
		}else {
			System.out.println("****��� : " + location + "Ÿ�̾� ��ũ****");
			return false; //���� �Ұ��� �ڵ�
		}
	}
	
}

package ch7.tire;

public class Tire {
	
	//�ʵ�
	public int maxRotation;
	public int accRotation;
	public String location;
	
	//������
	public Tire(String location, int maxRotation) {
		
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accRotation; //1������
		if(accRotation < maxRotation) {
			System.out.println(location + " Ÿ�̾� ���� : " + (maxRotation - accRotation)+ "���ϸ���");
			return true;
		}else {
			System.out.println("!!!!! ��� : " + location + " Ÿ�̾� ��ũ !!!!!");
			return false;
		}
	}

}

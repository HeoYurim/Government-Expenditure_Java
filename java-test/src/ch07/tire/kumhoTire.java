package ch07.tire;

public class kumhoTire extends Tire{
	
	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation; //1������
		if(accRotation < maxRotation) {
			System.out.println(location + " ��ȣ Ÿ�̾� ���� : " + (maxRotation - accRotation)+ "���ϸ���");
			return true;
		}else {
			System.out.println("!!!!! ��� : " + location + " ��ȣŸ�̾� ��ũ !!!!!");
			return false;
		}
	}

	

}

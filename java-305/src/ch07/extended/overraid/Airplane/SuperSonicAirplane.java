package ch07.extended.overraid.Airplane;

public class SuperSonicAirplane extends Airplane{ //�ڽ� Ŭ����

	public static final int NORMAL = 1; //�Ϲ� ����
	public static final int SUPERSONIC = 2; //�ʰ�� ����
	
	//��� ����(������ �ʴ� ��)
	public int flyMode = NORMAL; //�⺻ ���� ���� �Ϲ� ���� ��� 1

	
	@Override
	public void fly() {

		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}else {
			super.fly(); //�θ𿡼� �����ϴ� fly �޼ҵ� ȣ��
		}
		
	}
	
	
}

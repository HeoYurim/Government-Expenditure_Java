package ch07.extended.overraid.Airplane;

public class SuperSonicEx {

	public static void main(String[] args) {

		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff(); //�̷��մϴ�.
		sa.fly(); //�Ϲݺ����մϴ�.
		
		//supersonic ���� ����
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();  //������ �����մϴ�.
		
		//normal ���� ����
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();  //������ �����մϴ�.
		
		sa.land();
		
	}

}

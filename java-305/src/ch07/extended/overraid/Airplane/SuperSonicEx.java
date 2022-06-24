package ch07.extended.overraid.Airplane;

public class SuperSonicEx {

	public static void main(String[] args) {

		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff(); //이륙합니다.
		sa.fly(); //일반비행합니다.
		
		//supersonic 모드로 변경
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();  //초음속 비행합니다.
		
		//normal 모드로 변경
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();  //초음속 비행합니다.
		
		sa.land();
		
	}

}

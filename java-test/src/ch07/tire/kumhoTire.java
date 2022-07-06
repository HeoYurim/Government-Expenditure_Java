package ch07.tire;

public class kumhoTire extends Tire{
	
	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation; //1씩증가
		if(accRotation < maxRotation) {
			System.out.println(location + " 금호 타이어 수명 : " + (maxRotation - accRotation)+ "마일리지");
			return true;
		}else {
			System.out.println("!!!!! 경고 : " + location + " 금호타이어 펑크 !!!!!");
			return false;
		}
	}

	

}

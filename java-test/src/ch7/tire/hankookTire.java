package ch7.tire;

public class hankookTire extends Tire{
	
	//필드는 부모 필드 이용
	
	//생성자
	public hankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation; //1씩증가
		if(accRotation < maxRotation) {
			System.out.println(location + " 한국 타이어 수명 : " + (maxRotation - accRotation)+ "마일리지");
			return true;
		}else {
			System.out.println("!!!!! 경고 : " + location + " 한국 타이어 펑크 !!!!!");
			return false;
		}
	}
	
}

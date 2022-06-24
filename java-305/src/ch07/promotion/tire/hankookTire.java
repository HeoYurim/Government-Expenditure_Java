package ch07.promotion.tire;

public class hankookTire extends Tire{

	//필드는 부모 필드 활용
	
	//생성자
	public hankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//오버라이딩 메소드
	@Override
	public boolean roll() {
		++accRotation; //누적 회전수 1씩 증가
		if(accRotation < maxRotation) {
			System.out.println(location + "한국타이어 수명 : " + (maxRotation - accRotation) + "마일리지");
			return true; //주행 가능 코드
		}else {
			System.out.println("****경고 : " + location + "한국타이어 펑크****");
			return false; //주행 불가능 코드
		}
	}	
}

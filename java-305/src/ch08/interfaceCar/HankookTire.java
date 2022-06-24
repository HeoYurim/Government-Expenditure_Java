package ch08.interfaceCar;

public class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	} //구현 클래스에서 메소드 재정의

}

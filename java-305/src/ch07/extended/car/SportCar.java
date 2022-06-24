package ch07.extended.car;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	} //스포츠카는 속도가 10씩 증가한다.
	
	
	
	/*
	@Override
	public void Stop() {
		System.out.println("스포츠카 멈춤");
		speed = 0;
	}//final 메소드는 오버라이딩이 안된다
	*/
}

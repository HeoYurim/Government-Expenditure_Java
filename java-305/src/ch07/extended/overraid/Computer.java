package ch07.extended.overraid;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		
		return super.areaCircle(r); //이 값을 수정하여 제공
		
	} //자식클래스
	
	
	
	
	/*
	@Override //어노테이션 : 코딩 시 작성법을 케어해주는 설명서 역할
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	} //메소드 오버라이딩 진행
	*/
}
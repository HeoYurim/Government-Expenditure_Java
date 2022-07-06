package ch09.Exam02;

public class Anonymous { //익명 구현 클래스
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	}; //익명 구현 객체
	
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("자동차가 달립니다.");
			}
			
		}; //메소드 안쪽 익명 구현 객체(로컬 클래스) 
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}

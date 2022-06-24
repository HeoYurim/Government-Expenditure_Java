package ch09.anonymousInterface;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	}; //RempteControl에 필드에 선언, 초기값 대입
	
	void method1() { //로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};//익명이라 뒤에 세미클론 붙임 //익명 로컬변수 종료
		
		localVar.turnOn(); //로컬변수 사용
		localVar.turnOff();
	} //method1 종료
	
	void method2(RemoteControl rc) {
		rc.turnOn(); //익명구현 사용
		rc.turnOff();
	} //method2 종료
}

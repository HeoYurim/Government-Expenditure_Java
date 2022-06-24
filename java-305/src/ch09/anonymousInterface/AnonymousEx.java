package ch09.anonymousInterface;

public class AnonymousEx {

	public static void main(String[] args) {

		//Anonymous 익명 객체 생성
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1(); //익명 객체 로컬 변수 사용
		anony.method2(
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("스마트 TV를 켭니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("스마트 TV를 끕니다.");
					}
				}			
		); 
	}

}

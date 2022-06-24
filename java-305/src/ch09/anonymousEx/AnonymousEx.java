package ch09.anonymousEx;

public class AnonymousEx {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous(); //객체 생성
		anony.field.wake(); //익명 객체 필드
		
		anony.method1(); //익명 객체 로컬 변수 사용
		
		anony.method2( //익명 객체 매개값 사용
				new Person() { //매개값의 다형성
					void study() {
						System.out.println("공부합니다.");
					}
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}//재정의 종료
				}//매개값 종료
		); //익명 객체 종료		
	}//main 종료
} //클래스 종료

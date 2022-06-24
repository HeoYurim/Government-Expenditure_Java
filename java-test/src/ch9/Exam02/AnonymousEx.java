package ch9.Exam02;

public class AnonymousEx {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.run(); //익명 객체 필드 사용
		anony.method1(); //익명 객체 로컬 변수 사용
		anony.method2(
				new Vehicle() {
					
					//익명 객체 매개값 사용
					@Override 
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				}
		);	
	}
}

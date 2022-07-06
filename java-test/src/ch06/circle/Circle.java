package ch06.circle;

public class Circle {

	private void secret() { //private은 클래스 내부에서만 접근 가능
		System.out.println("비밀이다.");
	}
	
	protected void findRadius() {
		System.out.println("반지름이 10.0센티이다.");
	}
	
	public void findArea() {
		System.out.println("넓이는 (PI *r *r)이다. ");
	}
	
}

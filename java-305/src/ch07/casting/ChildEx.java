package ch07.casting;

public class ChildEx {

	public static void main(String[] args) {

		Parent parent = new Child(); //자동 타입 변환으로 자식 객체를 통해 부모 객체를 생성한다.
		
		parent.field1 = "허유림";
		parent.method1(); //부모 클래스의 메소드
		parent.method2(); //부모 클래스의 메소드
//		parent.method3(); //자식 클래스의 메소드 -> 오류
//		parent.field2 = "김기원"; //자식 클래스의 필드 -> 오류
		
		Child child = new Child(); //강제 타입 변환
		child.method3(); //자식 클래스의 메소드
		child.field2 = "김기원"; //자식 클래스의 필드
		
		Child ch = (Child) parent; //강제 타입 변환
		ch.method3(); //자식 클래스의 메소드
		ch.field2 = "김기원"; //자식 클래스의 필드
		
	}

}

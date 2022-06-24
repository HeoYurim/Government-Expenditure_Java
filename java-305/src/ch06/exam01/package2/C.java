package ch06.exam01.package2; //A클래스와 다른 패키지

import ch06.exam01.package1.*;

public class C {
	
	public C() { //C 생성자 생성
		
		A a = new A(); //A클래스에 객체 생성
		a.field1 = 1; //public 접근 제한
//		a.field2 = 2; //컴파일 에러(default)
//		a.field3 = 3; //컴파일 에러(private)
		
		//메소드
		a.method1(); //public 접근 제한
//		a.method2(); //컴파일 에러(default)
//		a.method3(); //컴파일 에러(private)
	} //public을 제외한 모든 접근 제한은 불가(다른 패키지임)
	
		/*
		//필드
		A a1 = new A(true); //public으로 접근 가능
		A a2 = new A(1); //default 다른 패키지 접근 불가
		A a3 = new A("문자열"); //private 생성자로 접근 불가
		//private는 개인적으로 사용하는 것이라 접근 불가
		*/
}

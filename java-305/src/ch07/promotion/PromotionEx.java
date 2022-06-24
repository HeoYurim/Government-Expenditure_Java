package ch07.promotion;

class A{} //부모 클래스

class B extends A{} //자식 클래스
class C extends A{} //자녀 클래스

class D extends B{} //손자 클래스
class E extends C{} //손녀 클래스

public class PromotionEx {
	
	public static void main(String[] args) {

		B b = new B(); //자식 객체 생성
		C c = new C(); //자녀 객체 생성
		D d = new D(); //손자 객체 생성
		E e = new E(); //손녀 객체 생성
		
		A a1 = b; //부모 객체를 자식을 통해 a1을 생성
		A a2 = c;
		A a3 = d; 
		A a4 = e; 
		
		B b1 = d; //자식 객체를 손자를 통해 b1 생성
		C c1 = e; //자녀 객체를 손녀를 통해 c1 생성
		
//		B b2 = e; //컴파일 오류 (상속관계가 아님)
//		C c2 = d; //컴파일 오류 (상속관계가 아님)
		
	}

}

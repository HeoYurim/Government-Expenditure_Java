package ch08.interfaceim;

public class Ex {

	public static void main(String[] args) {

		//구현 클래스의 객체를 생성하여 impl 변수와 연결
		ImplementationC impl = new ImplementationC();
		
		interfaceA ia = impl; //자동 타입 변환 C를 이용해 A를 호출
		ia.methodA();
		
		System.out.println("------------------------");
		
		interfaceB ib = impl; //자동 타입 변환 C를 이용해 A를 호출
		ib.methodB();
		
		System.out.println("------------------------");
		
		interfaceC ic = impl; //자동 타입 변환 C를 이용해 A를 호출
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println("------------------------");

	}

}

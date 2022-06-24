package ch08.interfaceim;

public class ImplementationC implements interfaceC{ //구현 클래스
	
	//자식 인터페이스에 구현 클해스
	@Override
	public void methodA() {
		System.out.println("ImplementaionC에서 엄마 인터페이스 A 메소드");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementaionC에서 아빠 인터페이스 B 메소드");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementaionC에서 자식 인터페이스 C 메소드");
	} 
}

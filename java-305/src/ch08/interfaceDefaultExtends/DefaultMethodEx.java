package ch08.interfaceDefaultExtends;

public class DefaultMethodEx {
	
	public static void main(String[] args) {
		
		ChildInterface1 cil1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ParentInterface1의 method1 추상메소드 재정의");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface1의 method3 추상메소드 재정의");
			}
		}; //인터페이스를 바로 호출하여 사용하도록 익명의 구현 객체를 생성
		
		System.out.println("부모 인터페이스 상속");
		cil1.method1(); //재정의
		cil1.method2(); //부모인터페이스의 default메소드 호출
		cil1.method3(); //재정의
		
		System.out.println("----------------------------------------");
		
		ChildInterface1 cil2 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ParentInterface1의 method1 추상메소드 재정의");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2의 method3 추상메소드 재정의");
			}
		}; //인터페이스를 바로 호출하여 사용하도록 익명의 구현 객체를 생성
		
		System.out.println("자식에서 재정의");
		cil2.method1(); //재정의
		cil2.method2(); //부모인터페이스를 자식인터페이스에서 디폴트 메소드를 재정의하여 호출
		cil2.method3(); //재정의
		
		System.out.println("----------------------------------------");

		ChildInterface1 cil3 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ParentInterface1의 method1 추상메소드 재정의");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3의 method2 추상메소드 재정의");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface3의 method3 추상메소드 재정의");
			}
		}; //인터페이스를 바로 호출하여 사용하도록 익명의 구현 객체를 생성
		
		System.out.println("자식에서 추상메소드로 재정의");
		cil3.method1(); //재정의
		cil3.method2(); //부모인터페이스를 자식인터페이스에서 디폴트 메소드를 재정의하여 호출
		cil3.method3(); //재정의
		
	}
}

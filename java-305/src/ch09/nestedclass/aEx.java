package ch09.nestedclass;

public class aEx {

	public static void main(String[] args) {

		
		A a = new A();
		A.B b = a.new B();
		
		b.field1 = 3;
		b.method1();
		
		
		A.C c = new A.C(); //인스턴스 객체 생성
		c.field1 = 3;
		c.method1();
		
		
		A.C.field2 = 3; //객체 생성 없이 호출
		A.C.method2();
		
		a.metod();
	}

}

package ch09.nestedclass;

public class aEx {

	public static void main(String[] args) {

		
		A a = new A();
		A.B b = a.new B();
		
		b.field1 = 3;
		b.method1();
		
		
		A.C c = new A.C(); //�ν��Ͻ� ��ü ����
		c.field1 = 3;
		c.method1();
		
		
		A.C.field2 = 3; //��ü ���� ���� ȣ��
		A.C.method2();
		
		a.metod();
	}

}

package ch09.outterClass;

public class Outter {
	
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-Method");
	}
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-Method");
		}
	void print() {
		System.out.println(this.field);
		this.method(); //��ø ��ü ����
		System.out.println(Outter.this.field);
		Nested.this.method(); //�ٱ��� ��ü ����
	}
	}
}

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
		this.method(); //ÁßÃ¸ °´Ã¼ ÂüÁ¶
		System.out.println(Outter.this.field);
		Nested.this.method(); //¹Ù±ùÂÊ °´Ã¼ ÂüÁ¶
	}
	}
}

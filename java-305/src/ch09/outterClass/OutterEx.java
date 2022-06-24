package ch09.outterClass;

public class OutterEx {

	public static void main(String[] args) {
		//官冰率 按眉 积己
		Outter outter = new  Outter();
		
		outter.method();
		System.out.println(outter.field);
		
		System.out.println("--------------------");
		
		//救率 Nested
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}

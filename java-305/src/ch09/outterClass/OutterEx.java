package ch09.outterClass;

public class OutterEx {

	public static void main(String[] args) {
		//�ٱ��� ��ü ����
		Outter outter = new  Outter();
		
		outter.method();
		System.out.println(outter.field);
		
		System.out.println("--------------------");
		
		//���� Nested
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}

package ch07.extended;

public class extendsTestch extends extendsTest{

	int field2;
	void method2() {
		//���๮
	}//�޼ҵ� ����
	
	public static void main(String[] args) {
		
		extendsTestch b = new extendsTestch(); //��ü ����
		b.field1 = 10;
		b.method1();
		
		b.field2 = 20;
		b.method2();
	}
	
	
	//�ڽ� Ŭ������ �θ� ��ü�� Ȱ���Ѵ�.
}

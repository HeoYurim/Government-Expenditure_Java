package ch08.interfaceDefault;

public class DefaultMethodEx {

	public static void main(String[] args) {

		//MyInterface �������̽��� MyClassA() ���� Ŭ������ �̿��Ͽ� ��ü ����
		MyInterface mi1 = new MyClassA();
		
		mi1.method1(); //�����ǵ� �޼ҵ� ȣ��
		mi1.method2(); //�������̽����� �����ϴ� �޼ҵ� ȣ��
		
		//MyInterface �������̽��� MyClassB() ���� Ŭ������ �̿��Ͽ� ��ü ����
		MyInterface mi2 = new MyClassB();
		
		mi2.method1(); //�����ǵ� �޼ҵ� ȣ��
		mi2.method2(); //�������̽����� �����ϴ� �޼ҵ� ȣ��
		
	} //��� ����Ʈ�� ������ �޼ҵ�� ������ ����� �� �� �ִ�.
}

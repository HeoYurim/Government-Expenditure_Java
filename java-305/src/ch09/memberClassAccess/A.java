package ch09.memberClassAccess;

public class A {
	//�ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	/*�ν��Ͻ� ��� Ŭ���� B�� �ٱ� Ŭ������ �ν��Ͻ� �ʵ�(field1)�� �ʱⰪ�̳�
	  �ν��Ͻ� �޼ҵ�(method1())���� ��ü�� ������ �� �ִ�.*/
	
	void method1() { //�ν��Ͻ� �޼ҵ�
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �ʵ� �ʱ�ȭ
//	static B field3 = new B(); //�Ұ��� (�ν��Ͻ� ��� Ŭ����)
	static C field4 = new C(); //���� (���� ��� Ŭ����)
	
	//���� �޼ҵ�
	static void method2() {
//		B var1 = new B(); //�Ұ���(�ν��Ͻ�)
		C var2 = new C(); //����(���� ��� Ŭ����)
	}
	
	class B{} //�ν��Ͻ� ��� Ŭ����
	static class C{} //���� ��� Ŭ����
}

package ch06.exam01.package1;

public class A { 
	
	//�ʵ�
	public int field1; //public ���� ����
	int field2; //default ���� ����
	private int field3; //private ���� ����
	
	//������
	public A() {
		field1 = 1; //public ���� ����
		field2 = 2; //default ���� ����
		field3 = 3; //private ���� ����
		
		method1();
		method2();
		method3();
	}
	
	//�޼ҵ�
	public void method1() {} //public �޼ҵ�
	void method2() {} //default �޼ҵ�
	private void method3() {} //private �޼ҵ�
	
	/*
	//�ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//������ �����ε�
	public A(boolean b) {} //public ���� ����
	A(int b){} //default ���� ����
	private A(String s) {} //private ���� ����
 	//�ڽ��� �����ڴ� �ڽ� �ʵ忡 ��� ������ �� �� �ִ�.
   */
}    
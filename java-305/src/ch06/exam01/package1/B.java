package ch06.exam01.package1;

import ch06.exam01.package2.*;

public class B {
	
	public B() { //������ ȣ��
		
		//�ʵ� 
		A a = new A(); //AŬ������ ��ü ����
		a.field1 = 1; //public ���� ����
		a.field2 = 2; //default ���� ����
//		a.field3 = 3; //������ ����(private)
		
		//�޼ҵ�
		a.method1(); //public ���� ����
		a.method2(); //default ���� ����
//		a.method3(); //������ ����(private)
	} //���� ��Ű�������� private�� ������ ��� ���� ���� ���
	
	
	/*
	//�ʵ� ����
	A a1 = new A(true); //public ���� ����
	A a2 = new A(1); //default ���� ����
//	A a3 = new A("���ڿ�");  //private ���� ����
	//private�� ���������� ����ϴ� ���̶� ���� ��Ű���� �Ұ�
	*/
}

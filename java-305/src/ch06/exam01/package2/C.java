package ch06.exam01.package2; //AŬ������ �ٸ� ��Ű��

import ch06.exam01.package1.*;

public class C {
	
	public C() { //C ������ ����
		
		A a = new A(); //AŬ������ ��ü ����
		a.field1 = 1; //public ���� ����
//		a.field2 = 2; //������ ����(default)
//		a.field3 = 3; //������ ����(private)
		
		//�޼ҵ�
		a.method1(); //public ���� ����
//		a.method2(); //������ ����(default)
//		a.method3(); //������ ����(private)
	} //public�� ������ ��� ���� ������ �Ұ�(�ٸ� ��Ű����)
	
		/*
		//�ʵ�
		A a1 = new A(true); //public���� ���� ����
		A a2 = new A(1); //default �ٸ� ��Ű�� ���� �Ұ�
		A a3 = new A("���ڿ�"); //private �����ڷ� ���� �Ұ�
		//private�� ���������� ����ϴ� ���̶� ���� �Ұ�
		*/
}

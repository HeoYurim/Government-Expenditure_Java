package ch09.fieldMethodAccess;

public class A {
	int field1;
	void method1() {} //�ٱ��� �ν��Ͻ� �޼ҵ�
	
	static int field2; //�ٱ��� ���� �ʵ�
	static void method2() {} //�ٱ��� ���� �޼ҵ�
	
	static class C{
		void method() {
//			field1 = 10; //�ν��Ͻ� �ʵ� ���Ұ���
//			method1(); //�ν��Ͻ� �޼ҵ� ���Ұ���
			 
			field2 = 10; //���� �ʵ� ��밡��		
			method2(); //���� �޼ҵ� ��밡��
		}
	}
	
	
	class B{ //�ν��Ͻ� ��� Ŭ����
		void method() {
			field1 = 10; //�ν��Ͻ� �ʵ� ��밡��
			method1(); //�ν��Ͻ� �޼ҵ� ��밡��
			 
			field2 = 10; //���� �ʵ� ��밡��		
			method2(); //���� �޼ҵ� ��밡��
		}
	}
}

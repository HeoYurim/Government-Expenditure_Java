package ch09.nestedclass;

public class A {
	
	A(){System.out.println("A��ü ����");}
	
	//�ν��Ͻ� ��� Ŭ����
	class B{
		int field1; //�ν��Ͻ� �ʵ�
//		static int field2; //���� �ʵ� �Ұ�
		
		B(){System.out.println("B��ü ����");} //������
		
		void method1() {
			//�ν��Ͻ� �޼ҵ�
		}
		
		/*
		static void method2() {
			//���� �޼ҵ�
		}
		*/
	}
	
	static class C{
		int field1; //�ν��Ͻ� �ʵ�
		static int field2; //���� �ʵ�
		void method1() {} //�ν��Ͻ� �޼ҵ�
		static void method2() {}; //���� �޼ҵ�
		C(){System.out.println("C��ü ����");} //������
	} //���� ��� Ŭ������ ��� ����� ����
	
	void metod() { //AŬ���� ���� �޼ҵ�
		//���� Ŭ����
		class D{
			
			D(){System.out.println("D��ü ����");} //������
			int field1;
	//		static int field2;
			
			void method1() {}
	//		static void method2() {}
			
		}
	D d = new D(); //�޼ҵ� ���ο����� ȣ��
	d.field1 = 3; //�ν��Ͻ� �ʵ� ��밡��
	d.method1(); //�ν��Ͻ� �޼ҵ�
	}
}

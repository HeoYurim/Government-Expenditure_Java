package ch06;

public class Television {
	
	int field1; //�ν��Ͻ� �ʵ�	
	void method1() { //�ν��Ͻ� �޼ҵ�
		
	}
	
	static int field2; //���� �ʵ�
	static void method2() { //���� �޼ҵ�
		
	}
	
	static { //���� ���
	//	field1 = 10; //�ν��Ͻ� �ʵ� ��� �Ұ�
	//	method1(); //�ν��Ͻ� �޼ҵ� ��� �Ұ�
		field2 = 20;
		method2();
	}
	
	static void method3() { //���� �޼ҵ�
		Television tel = new Television();
		tel.field1 = 10; //��ü �����Ͽ� ������ ����
		tel.method1(); //�ν��Ͻ� ����� ��ü �ʿ�
		
	//	this.field1 = 10; //������ ����
	//	this.method1(); //������ ����
		field2 = 10;
		method2();
	}
	
	
	/*
	static String company = "Samsung";
	static String model = "LED";
	static String info;
	
	static {//���� ���
		info = company + " - " + model;
	}
	*/
}

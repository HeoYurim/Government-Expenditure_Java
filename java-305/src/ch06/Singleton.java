package ch06;

public class Singleton {
	
	//���� �ʵ�
	private static Singleton st = new Singleton(); //��ü 1���� ��������� �̱��� ��ü ����
	//-> �ڽ��� ����� �����ؼ� �޸𸮿� �÷�����
	
	//������
	private Singleton() {} 
	
	//���� �޼ҵ�
	static Singleton getInstance() {
		return st; //�ܺο��� ����� st�� ������
	}
}

package ch08.interfaceDefaultExtends;

public interface ParentInterface {

	//�θ� �������̽�
	
	//�߻� �޼ҵ�� ���๮�� ����.
	public void method1();
	
	//����Ʈ �޼ҵ�� ���๮�� �ִ�.
	public default void method2() {
		System.out.println("�θ� �������̽��� �޼ҵ�2�� ����");
	}
}

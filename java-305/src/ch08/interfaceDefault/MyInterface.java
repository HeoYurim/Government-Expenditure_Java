package ch08.interfaceDefault;

public interface MyInterface {
	
	//�߻� �޼ҵ�� ������ ����ؾ� ��.
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface�� Default �޼ҵ� ����");
	}
	
}

package ch08.interfaceDefaultExtends;

public interface ChildInterface2 extends ParentInterface{
		
	//�θ� �������̽��� �޼ҵ�2�� ������ �Ͽ� ����
	@Override
	default void method2() {
		System.out.println("�θ� �������̽��� �޼ҵ�2�� ������ ����");
	}
	
	//�ڽĿ��� �����ϴ� �߻�޼ҵ�
	public void method3();

}

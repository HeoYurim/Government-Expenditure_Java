package ch08.interfaceim;

public class ImplementationC implements interfaceC{ //���� Ŭ����
	
	//�ڽ� �������̽��� ���� Ŭ�ؽ�
	@Override
	public void methodA() {
		System.out.println("ImplementaionC���� ���� �������̽� A �޼ҵ�");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementaionC���� �ƺ� �������̽� B �޼ҵ�");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementaionC���� �ڽ� �������̽� C �޼ҵ�");
	} 
}

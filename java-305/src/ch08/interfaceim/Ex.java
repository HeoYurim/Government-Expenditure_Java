package ch08.interfaceim;

public class Ex {

	public static void main(String[] args) {

		//���� Ŭ������ ��ü�� �����Ͽ� impl ������ ����
		ImplementationC impl = new ImplementationC();
		
		interfaceA ia = impl; //�ڵ� Ÿ�� ��ȯ C�� �̿��� A�� ȣ��
		ia.methodA();
		
		System.out.println("------------------------");
		
		interfaceB ib = impl; //�ڵ� Ÿ�� ��ȯ C�� �̿��� A�� ȣ��
		ib.methodB();
		
		System.out.println("------------------------");
		
		interfaceC ic = impl; //�ڵ� Ÿ�� ��ȯ C�� �̿��� A�� ȣ��
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println("------------------------");

	}

}

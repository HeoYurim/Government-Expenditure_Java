package ch08.interfaceDefaultExtends;

public class DefaultMethodEx {
	
	public static void main(String[] args) {
		
		ChildInterface1 cil1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ParentInterface1�� method1 �߻�޼ҵ� ������");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface1�� method3 �߻�޼ҵ� ������");
			}
		}; //�������̽��� �ٷ� ȣ���Ͽ� ����ϵ��� �͸��� ���� ��ü�� ����
		
		System.out.println("�θ� �������̽� ���");
		cil1.method1(); //������
		cil1.method2(); //�θ��������̽��� default�޼ҵ� ȣ��
		cil1.method3(); //������
		
		System.out.println("----------------------------------------");
		
		ChildInterface1 cil2 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ParentInterface1�� method1 �߻�޼ҵ� ������");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2�� method3 �߻�޼ҵ� ������");
			}
		}; //�������̽��� �ٷ� ȣ���Ͽ� ����ϵ��� �͸��� ���� ��ü�� ����
		
		System.out.println("�ڽĿ��� ������");
		cil2.method1(); //������
		cil2.method2(); //�θ��������̽��� �ڽ��������̽����� ����Ʈ �޼ҵ带 �������Ͽ� ȣ��
		cil2.method3(); //������
		
		System.out.println("----------------------------------------");

		ChildInterface1 cil3 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ParentInterface1�� method1 �߻�޼ҵ� ������");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3�� method2 �߻�޼ҵ� ������");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface3�� method3 �߻�޼ҵ� ������");
			}
		}; //�������̽��� �ٷ� ȣ���Ͽ� ����ϵ��� �͸��� ���� ��ü�� ����
		
		System.out.println("�ڽĿ��� �߻�޼ҵ�� ������");
		cil3.method1(); //������
		cil3.method2(); //�θ��������̽��� �ڽ��������̽����� ����Ʈ �޼ҵ带 �������Ͽ� ȣ��
		cil3.method3(); //������
		
	}
}

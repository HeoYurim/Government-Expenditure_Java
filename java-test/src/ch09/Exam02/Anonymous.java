package ch09.Exam02;

public class Anonymous { //�͸� ���� Ŭ����
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	}; //�͸� ���� ��ü
	
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("�ڵ����� �޸��ϴ�.");
			}
			
		}; //�޼ҵ� ���� �͸� ���� ��ü(���� Ŭ����) 
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}

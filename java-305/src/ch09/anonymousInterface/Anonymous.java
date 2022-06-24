package ch09.anonymousInterface;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	}; //RempteControl�� �ʵ忡 ����, �ʱⰪ ����
	
	void method1() { //���� ���������� ����
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};//�͸��̶� �ڿ� ����Ŭ�� ���� //�͸� ���ú��� ����
		
		localVar.turnOn(); //���ú��� ���
		localVar.turnOff();
	} //method1 ����
	
	void method2(RemoteControl rc) {
		rc.turnOn(); //�͸��� ���
		rc.turnOff();
	} //method2 ����
}

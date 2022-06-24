package ch09.anonymousInterface;

public class AnonymousEx {

	public static void main(String[] args) {

		//Anonymous �͸� ��ü ����
		Anonymous anony = new Anonymous();
		
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1(); //�͸� ��ü ���� ���� ���
		anony.method2(
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("����Ʈ TV�� �մϴ�.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("����Ʈ TV�� ���ϴ�.");
					}
				}			
		); 
	}

}

package ch9.Exam02;

public class AnonymousEx {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.run(); //�͸� ��ü �ʵ� ���
		anony.method1(); //�͸� ��ü ���� ���� ���
		anony.method2(
				new Vehicle() {
					
					//�͸� ��ü �Ű��� ���
					@Override 
					public void run() {
						System.out.println("Ʈ���� �޸��ϴ�.");
					}
				}
		);	
	}
}

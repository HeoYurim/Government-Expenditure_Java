package ch09.anonymousEx;

public class AnonymousEx {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous(); //��ü ����
		anony.field.wake(); //�͸� ��ü �ʵ�
		
		anony.method1(); //�͸� ��ü ���� ���� ���
		
		anony.method2( //�͸� ��ü �Ű��� ���
				new Person() { //�Ű����� ������
					void study() {
						System.out.println("�����մϴ�.");
					}
					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}//������ ����
				}//�Ű��� ����
		); //�͸� ��ü ����		
	}//main ����
} //Ŭ���� ����

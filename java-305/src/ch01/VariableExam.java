package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach; //���� Ÿ���� mach������ ����
		int distance; //���� Ÿ���� distance ���� ����
		
		mach = 340;
		distance = mach * 60 * 60; //������ m/s�� ���
		System.out.println("�Ҹ��� 1�ð����� ���� �Ÿ� : "  +distance + "m");
		
		double radius; // �Ǽ� Ÿ���� radius ������ ����
		double area; //�Ǽ� Ÿ���� area Ÿ��
		radius = 10; //�Ǽ� ���� �Կ�
		area = radius * radius * 3.14;
		System.out.println("�������� "+ radius + "�� ���� ���̴� " + area);
		
		char firstName; //����Ÿ���� firstName ���� ����
		char midName;
		char lastName;
		firstName = '��'; //firstName�� ���� �Է�
		midName = '��';
		lastName = '��';
		
		System.out.print(firstName); //firstName�� ���� ���(���� ����)
		System.out.print(midName);
		System.out.print(lastName);
		
		/* System.out.println(firstName + midName + lastName); //���ϱ� ���� �ȵ�*/
		//println�� enter ȿ���� �ְ� print�� ���� �ٷ� ��
	}

}

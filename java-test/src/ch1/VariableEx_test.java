package ch1;

public class VariableEx_test {

	public static void main(String[] args) {

		int mach = 340;
		int distance = mach * 60 * 60;
		
		System.out.println("�Ҹ��� 1�ð����� ���� �Ÿ� : " + distance + "m");
		
		System.out.println("-----------------------------");
				
		int radius = 10;
		double area;	
		area = radius * radius * 3.14;
		
		System.out.println("�������� ���̰� " + radius + "�� ���� ���̴� = " + area);
		
		System.out.println("-----------------------------");
		
		char firstName = '��';
		char midName = '��';
		char lastName = '��';
		
	//	System.out.print(firstName + midName + lastName); -> ���ϱ� ���� �̸��� �ƴ϶� ���ڰ� ����
		System.out.print(firstName);
		System.out.print(midName);
		System.out.print(lastName);
	}

}

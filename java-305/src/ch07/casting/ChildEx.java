package ch07.casting;

public class ChildEx {

	public static void main(String[] args) {

		Parent parent = new Child(); //�ڵ� Ÿ�� ��ȯ���� �ڽ� ��ü�� ���� �θ� ��ü�� �����Ѵ�.
		
		parent.field1 = "������";
		parent.method1(); //�θ� Ŭ������ �޼ҵ�
		parent.method2(); //�θ� Ŭ������ �޼ҵ�
//		parent.method3(); //�ڽ� Ŭ������ �޼ҵ� -> ����
//		parent.field2 = "����"; //�ڽ� Ŭ������ �ʵ� -> ����
		
		Child child = new Child(); //���� Ÿ�� ��ȯ
		child.method3(); //�ڽ� Ŭ������ �޼ҵ�
		child.field2 = "����"; //�ڽ� Ŭ������ �ʵ�
		
		Child ch = (Child) parent; //���� Ÿ�� ��ȯ
		ch.method3(); //�ڽ� Ŭ������ �޼ҵ�
		ch.field2 = "����"; //�ڽ� Ŭ������ �ʵ�
		
	}

}

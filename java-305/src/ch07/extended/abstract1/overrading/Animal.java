package ch07.extended.abstract1.overrading;

public abstract class Animal { //������ ������ �߻� Ŭ����
	
	public String kind; //������ ������ �޴� �ʵ�
	
	//������ �⺻ �����ڸ� Ȱ��(����)
	
	public void breathe() { //�Ϲ� �޼ҵ�
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); //�߻� �޼ҵ�
	//�ڽ� Ŭ�������� ������ Ȱ���ؾ� �ϴ� �޼ҵ�
	//�߰�ȣ ���� ���� �ۼ��Ǹ�, �ڽĿ��� ������ �Ǿ� Ȱ��ȴ�.
}

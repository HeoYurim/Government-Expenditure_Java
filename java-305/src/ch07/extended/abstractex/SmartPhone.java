package ch07.extended.abstractex;

public class SmartPhone extends Phone{
	
	//������
	public SmartPhone(String owner) {
		super(owner);
	} //������ �߻��� �̿��Ͽ� �ڵ����� ����
	
	//�޼ҵ�(������ ���� �� �������� ������ �����Ѵ�)
	public void internetSerarch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}

	
}

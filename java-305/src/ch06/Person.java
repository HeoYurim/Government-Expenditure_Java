package ch06;

public class Person {
	
	//�ʵ� ����(��ü�� �����Ͱ� ����Ǵ� ��)
	final String nation = "Korea"; //�ʱⰪ ����
	final String ssn; //�ʱⰪ ����(�����ڷ� ����)
	String name; //�Ϲ� �ʵ� ����
	
	//������ ����
	public Person(String ssn, String name) {
		this.ssn = ssn; //this�� �ʵ忡 �ִ� ���� ������
		this.name = name;
	}
}

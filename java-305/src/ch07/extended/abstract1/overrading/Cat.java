package ch07.extended.abstract1.overrading;

public class Cat extends Animal{

	public Cat() {
		this.kind = "������";
	} //�ʵ带 ��� �޾� kind ���� �����Ѵ�.
	
	@Override
	public void sound() {
		System.out.println("�ɳɳɳɳɳ�");		
	} //�߻� �޼ҵ� ���� ��� �� �������̵��� ����

}

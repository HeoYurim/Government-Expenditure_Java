package ch07.extended.abstract1.overrading;

public class Dog extends Animal{

	public Dog() {
		this.kind = "������";
	} //�ʵ带 ��� �޾� kind ���� �����Ѵ�.
	
	@Override
	public void sound() {
		System.out.println("�۸۸۸۸۸۸۸ۿппп�");		
	} //�߻� �޼ҵ� ���� ��� �� �������̵��� ����

}

package ch07.extended.abstractex;

public class PhoneEx {

	public static void main(String[] args) {
		
		//Phone�̶�� ��ü�� �߻� Ŭ������ �θ������� ��ü ���� �ȵ�
		//Phone ph = new Phone();
		
		SmartPhone sp = new SmartPhone("������");
		
		sp.turnOn(); //�θ��� ������ �մϴٶ�� �޼ҵ� ȣ��
		sp.internetSerarch(); //�ڽ��� ���ͳ� �˻� �մϴ�. �޼ҵ� ȣ��
		sp.turnOff(); //�θ��� ������ ���ϴ� ��� �޼ҵ� ȣ��
		
	}

}

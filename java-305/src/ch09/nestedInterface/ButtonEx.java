package ch09.nestedInterface;

public class ButtonEx {

	public static void main(String[] args) {
		
		//��ư ��ü�� ����
		Button btn = new Button();
		
		//�Ű������� ������
		btn.setOnClickListener(new CallListener()); //��ȭ�� �Ŵ� Ŭ����
		btn.touch();
		
		btn.setOnClickListener(new MessageListener()); //�޼����� ������ Ŭ����
		btn.touch();
		
		
	}

}

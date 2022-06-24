package ch09.anonymousUI;

public class Button {

	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}//�Ű������� ������
	
	void touch() {
		listener.onClick();
	}//���� ��ü�� �޼ҵ� ȣ��
	
	interface OnClickListener{ //��ø �������̽� ����
		void onClick();
	}
}

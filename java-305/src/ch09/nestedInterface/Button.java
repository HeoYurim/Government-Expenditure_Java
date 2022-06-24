package ch09.nestedInterface;

public class Button {

	//��ư�� Ŭ������ �� �̺�Ʈ�� ó���ϴ� ��ü�� ����
	//�ƹ� ��ü�� ������ �ȵǰ� Button ���ο� ����� ��ø �������̽��� ������ ��ü�� �޾ƾ� �Ѵ�.
	
	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	} //�Ű������� ������
	
	void touch() {
		listener.onClick();
	}//���� ��ü�� onClick() �޼ҵ� ȣ��
	
	interface OnClickListener{
		void onClick();
	} //��ø �������̽�
	
}

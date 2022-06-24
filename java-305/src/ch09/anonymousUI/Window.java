package ch09.anonymousUI;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	}; //�ʵ� ����� �ʱⰪ ����
	
	Window(){
		btn1.setOnClickListener(listener); //�Ű������� �ʵ� ����
		btn2.setOnClickListener(new Button.OnClickListener() {			
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		}); //�Ű������� �͸� ���� ��ü�� ����
	}
}

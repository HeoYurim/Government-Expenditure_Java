package ch08.interfaceEx;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		
		RemoteControl.changeBattery();
		
		/*
		RemoteControl rc = null; //�������̽��� ������ ���� Ÿ������ null ���� �ִ´�.
		rc = new Television(); //�ڷ����� ��ü�� �������̽� ����		
		rc.turnOn(); //������ �մϴ�.
		rc.setMute(true); //�������̽� ����Ʈ Ȱ��
		rc.setMute(false);
		rc.turnOff(); //������ ���ϴ�.
		
		//����� ��ü�� �������̽��� �ٷ� ����
		RemoteControl rc1 = new Audio();		
		rc1.turnOn(); //������ �մϴ�.
		rc1.setMute(true); //�������̽� ����Ʈ ������
		rc1.setMute(false);
		rc1.turnOff(); //������ ���ϴ�.
		*/
		
		/*
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		}; //�������̽��� ��ü�� �����Ͽ� �͸� �����ϴ� ��ü 
		
		*/
		/*
		//�������̽��� ������� �ʰ� ��ü�� �����Ͽ� ���
		Television tv = new Television();
		
		tv.turnOn();
		tv.turnOff();
		
		RemoteControl rc; //�������̽��� ������ �ִ´�.
		
		rc = new Television(); //�ڷ����� ��ü�� �������̽� ����
		
		rc.turnOn(); //������ �մϴ�.
		rc.turnOff(); //������ ���ϴ�.
		
		rc = new Audio();
		
		rc.turnOn(); //������ �մϴ�.
		rc.turnOff(); //������ ���ϴ�.
		*/
	}
}

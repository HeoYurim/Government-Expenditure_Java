package ch12.threadTest;

public class TaskEx {

	public static void main(String[] args) {
		/*
		//Tesk ���� ��ü�� ���������� ����
		Runnable Tk = new Tesk();
		
		//Thread �����ڸ� ȣ���ϸ� �۾� �����尡 �����ȴ�.
		Thread th = new Thread(Tk);
		*/
		
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//�����尡 ������ �ڵ� 
			} //run ����
		}); // �͸� ���� ��ü
	}
}

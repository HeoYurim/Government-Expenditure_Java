package ch12.beepTest2;

public class BeepTaskEx {

	public static void main(String[] args) {
		Runnable bt = new BeepTask(); //BeepTask Runnable ������
		Thread th1 = new Thread(bt); //BeepTask ������ ��ü ����
		th1.start(); //�۾� ������ 1 ����
		
		for(int i = 0; i < 10; i++) {
			System.out.println("�츮��");
			try {
				Thread.sleep(1000); //1�� ���� ��� ����
			}catch(Exception e) {
				System.out.println("���� �߻�");
			}
		}
	}

}

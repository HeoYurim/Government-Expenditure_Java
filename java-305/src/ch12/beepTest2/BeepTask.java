package ch12.beepTest2;

import java.awt.*;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
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

package ch12.beepTest;

import java.awt.*;

public class BeepTestEx1 {
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); //0.5�� ���� ��� ����
			}catch(Exception e) {
				System.out.println("���� �߻�");
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("�츮��");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("���� �߻�");
			}
		}
	}
}

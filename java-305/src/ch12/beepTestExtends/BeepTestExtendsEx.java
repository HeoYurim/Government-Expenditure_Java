package ch12.beepTestExtends;

import java.awt.*;

public class BeepTestExtendsEx {

	public static void main(String[] args) {
		Thread th = new BeepTestExtends();
		th.start(); //���̺귯�� Ŭ������ ����Ͽ� ������ ����
		
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

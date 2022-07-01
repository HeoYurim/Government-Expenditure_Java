package ch12.beepTestExtends;

import java.awt.*;

public class BeepTestExtends extends Thread{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) {
			System.out.println("띠리링");
			try {
				Thread.sleep(1000); //1초 동안 대기 상태
			}catch(Exception e) {
				System.out.println("오류 발생");
			}
		}
	}
	
	
}

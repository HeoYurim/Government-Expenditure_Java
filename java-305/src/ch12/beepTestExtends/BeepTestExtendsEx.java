package ch12.beepTestExtends;

import java.awt.*;

public class BeepTestExtendsEx {

	public static void main(String[] args) {
		Thread th = new BeepTestExtends();
		th.start(); //라이브러리 클래스를 사용하여 스레드 생성
		
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

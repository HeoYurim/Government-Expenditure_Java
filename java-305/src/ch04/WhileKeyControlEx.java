package ch04;

import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws Exception {

		boolean run = true;		//���࿩�θ� �Ǵ�
		int speed = 100;		//���� �ӵ��� 100km/h
		int keyCode = 0;		//Ű����� �ԷµǴ� ��
		
		while(run){	//run�� �ʱⰪ�� true�̱� ������ �������̶�� ��
			if(keyCode!= 13 && keyCode != 10) {
				System.out.println("-------------");
				System.out.println("1.���� | 2. �극��ũ | 3. ����");
				System.out.println("-------------");
				System.out.print("���� : ");
			}
			keyCode = System.in.read();
		//	System.out.println(keyCode);
			
			if(keyCode == 49) {
				speed += 5;
				System.out.println("���� �ӵ� : " + speed);
			}else if(keyCode == 50) {
				speed -= 5;
				System.out.println("���� �ӵ� : " + speed);
			}else if(keyCode == 51) {
				run = false;
				System.out.println("ũ���� ����� ����˴ϴ�.");
				System.out.println("���� �ӵ� : " + speed);
				System.out.println("��������.");
			}
		}
		System.out.println("���α׷� ����");
	}

}

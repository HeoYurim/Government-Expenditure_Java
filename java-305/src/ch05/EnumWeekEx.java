package ch05;

import java.util.Calendar; //����� Ŭ������ Ȱ���� �� ���, �ڵ����� �ȵ� �� ctrl + shift + o

public class EnumWeekEx {

	public static void main(String[] args) {
		
		Week today = null; //Week Ÿ�Կ� today ������ �����ϰ� ������ ���߿� �ϰڴ�.
		
		Calendar cal = Calendar.getInstance(); //Ķ���� �ν��Ͻ� ����
		
		int year = cal.get(Calendar.YEAR); //�⵵�� ���´�.			
		int month = cal.get(Calendar.MONTH) + 1; //��ǻ�ʹ� 0�� �����̶� +1�� ����		
		int day = cal.get(Calendar.DAY_OF_MONTH); //�� �޿� �ϼ��� ���		
		int week = cal.get(Calendar.DAY_OF_WEEK); //������ ���ڷ� ����Ѵ�. �Ͽ����� 1
	
		switch(week) {
		case 1 : 
			today = Week.SUNDAY ; break;
		case 2 : 
			today = Week.MONDAY ; break;
		case 3 : 
			today = Week.TUESDAY ; break;
		case 4 : 
			today = Week.WEDNESDAY ; break;
		case 5 : 
			today = Week.THURSDAY ; break;
		case 6 : 
			today = Week.FRIDAY ; break;
		case 7 : 
			today = Week.SATURDAY ; break;
		}
		
		System.out.println("���� ��¥�� : " + year + "�� " +  month + "�� " + day + "�� (" + today + ")");
		
		int hour = cal.get(Calendar.HOUR); //�ð�
		int minute = cal.get(Calendar.MINUTE); //��
		int second = cal.get(Calendar.SECOND); //��
	
		System.out.println("���� �ð��� : " + hour + "�� " +  minute + "�� " + second + "��");
		
		//���Ϻ� ������(���� �н���ǥ)
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ����Դϴ�. ������ ���ô�!");
		}else if(today == Week.MONDAY) {
			System.out.println("�������Դϴ�. ������ ���� ���� �Ϸ� ���ô�....");
		}else if(today == Week.TUESDAY) {
			System.out.println("ȭ�����Դϴ�. ������ ��սô�...");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("�������Դϴ�. ������ ��ô�. �ָ� ��Ʋ ���ҽ��ϴ�!!");
		}else if(today == Week.THURSDAY) {
			System.out.println("������Դϴ�. ������ �Ϸ縦 �����ô�.");
		}else if(today == Week.FRIDAY) {
			System.out.println("�ݿ����Դϴ�. ������ ������ ȭ���ϰ� ��ô�!!!!!");
		}else if(today == Week.SATURDAY) {
			System.out.println("������Դϴ�. ������ ��ô�! �츮���� �Ϸ簡 �� ���ҽ��ϴ�~");
		}
		
		
		
		/*
		Week today = Week.SUNDAY;
		System.out.println(today == Week.SUNDAY); //���� ���� ��ü �ּҰ� ����.
		
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2); //Week Ÿ�Կ� ���� ����� �����ص� ��ü�� ����.
		*/
	}

}

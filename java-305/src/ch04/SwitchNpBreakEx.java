package ch04;

public class SwitchNpBreakEx {

	public static void main(String[] args) {

		int time = (int)(Math.random() * 4) + 6;
		
		System.out.println("[���� �ð��� : " + time + "��]");
		
		switch(time) {
		case 6 :
			System.out.println("������ ������ �ϰ� ��ħ�� �Խ��ϴ�.");
		case 7 :
			System.out.println("��� �غ� �մϴ�.");
		case 8 : 
			System.out.println("������ Ÿ�� ����� �մϴ�.");
		case 9 :
			System.out.println("���� �غ� �մϴ�.");
		case 10 :
			System.out.println("�Ἦ�ڿ��� ��ȭ�� �մϴ�.");
		default :
			System.out.println("�ڹٸ� ������ ����Ĩ�ϴ�.");
		}
	}
}

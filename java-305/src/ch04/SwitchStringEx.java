package ch04;

public class SwitchStringEx {

	public static void main(String[] args) {

		String position = "����";

		switch (position) {
		case "����":
			System.out.println(position + "�������� 1000����");
			break;
		case "����":
			System.out.println(position + "�������� 1500����");
			break;
		case "�븮":
			System.out.println(position + "�������� 2000����");
			break;
		default:
			System.out.println("������ ����.");
			break;
		}

	}

}

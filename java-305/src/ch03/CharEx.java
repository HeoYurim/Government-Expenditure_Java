package ch03;

public class CharEx {

	public static void main(String[] args) {

		char c1 = 'A' + 1; //65 + 1 -> charŸ������ �Ѿ��. -> B
		char c2 = 'A'; //65 -> charŸ������ c2�� ����
		
	//	char c3 = c2 + 1; //c2�� char Ÿ������ 1�� ���Ϸ��� �ߴµ� int�� ���
		char c3 = (char)(c2 + 1);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
	}

}

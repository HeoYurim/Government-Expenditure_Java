package ch04;

public class BreakEx {

	public static void main(String[] args) {

		int i = 0;
		
		while(true) {
			int num = (int)(Math.random() * 45) + 1;
				System.out.println("������ �ζǹ�ȣ : " + num);
				i++;
				if(i == 6) {
					System.out.println("���α׷� ����");
					break;
				}
			}	
	}
}

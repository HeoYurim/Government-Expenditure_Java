package ch03;

public class BitReverseEx {

	public static void main(String[] args) {
		
		int v1 = 10;	//int v1�� 10�� ����
		int v2 = ~v1;	//int v2�� 10�� ��Ʈ������ ����
		int v3 = ~v1 + 1;	//int v2���� 1�� ���Ѵ�.
		
		System.out.println(toBinaryString(v1) + "(������ : " + v1 + ")");
		//toBinaryString�� �Ʒ��ʿ� ����ڰ� ���� �޼ҵ带 Ȱ���Ͽ� 2�� ���
		System.out.println(toBinaryString(v2) + "(������ : " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(������ : " + v3 + ")");
		
		System.out.println("--------------------------------");
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;

		System.out.println(toBinaryString(v4) + "(������ : " + v4 + ")");
		System.out.println(toBinaryString(v5) + "(������ : " + v5 + ")");
		System.out.println(toBinaryString(v6) + "(������ : " + v6 + ")");
	}

	public static String toBinaryString(int value) {	
		//9�ٿ� �ִ� v1���� �Է� �޾� 2�� 32���� ���ڷ� ����ϱ� ���� �޼ҵ�
		String str = Integer.toBinaryString(value);		//������ 2������ return�ϴ� �޼ҵ�
		while(str.length() < 32 ) {	//str�� ���� ���̰� 32���� ������ �ݺ�
			str = "0" + str; //32���� ������ �� ���� �տ� 0�� ���̴� ����
		}
		return str; //������� ��ȯ
		
		
	}

}

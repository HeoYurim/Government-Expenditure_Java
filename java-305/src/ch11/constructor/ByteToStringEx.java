package ch11.constructor;

public class ByteToStringEx {

	public static void main(String[] args) {
		
		//����Ʈ �迭�� ���ڿ��� ��ȯ�ϴ� ���� 72 -> H, 101 -> e
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); //6��°���� 4�� (0������ ���ߵ�) 
		System.out.println(str2);
	}

}

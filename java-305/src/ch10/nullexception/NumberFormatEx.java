package ch10.nullexception;

public class NumberFormatEx {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a200";
		
		//parseInt�� ���ڿ��� ������ ��ȯ
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}


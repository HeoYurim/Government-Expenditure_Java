package ch02;

public class OperationsPromotionEx {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
	//	byte byteValue3 = byteValue1 + byteValue2;   //������ ���� (int�� �⺻ Ÿ���̱� ������)
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';  //65
		char charValue2 = 1;    //1
	//	char charValue3 = charValue1 + charValue2;   //������ ����
		
		int intValue2 = charValue1 + charValue2;     // 65 + 1
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char)intValue2);
		
		int intValue5 = 10;
	//	int intValue6 = 10 / 4.0;  //������ ����
		double doubleValue = intValue5 / 4.0;   //ū ���� double�� �ڵ�Ÿ�� ��ȯ
		System.out.println(doubleValue);
	}

}

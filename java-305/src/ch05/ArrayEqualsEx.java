package ch05;

public class ArrayEqualsEx {

	public static void main(String[] args) {

		String[] strArray = new String[3];	//strArray������ 1���� 3ĭ �迭�� �����Ѵ�.
		strArray[0] = "Java";	//strArray 0��°�� Java String ��ü�� �����Ͽ� �����Ѵ�.
		strArray[1] = "Java";	//strArray 1��°�� Java String ��ü�� �̹� �־� �����Ѵ�.
		strArray[2] = new String ("Java"); //new �����ڸ� �̿��Ͽ� ���� ������ ��ü�� ����

		System.out.println("strArray 0���� 1�� ����� : "  + (strArray[0] == strArray[1])); //true
		System.out.println("strArray 0���� 2�� ����� : "  + (strArray[0] == strArray[2])); //false
		System.out.println("strArray 0���� 2�� ����� : "  + strArray[0].equals(strArray[2])); //true

	}

}

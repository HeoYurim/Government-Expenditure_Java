package ch05;

public class ArrayCopyEx {

	public static void main(String[] args) {

		int[] oldIntArray = {1,2,3}; //3ĭ¥�� ���� �迭 ����
		int[] newIntArray = new int[5]; //5ĭ¥�� ���ο� �迭 ����
		
		for(int i = 0; i <oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; //���� �迭 i���� �űԹ迭 i���� �ִ´�.
		}
		
		for(int x = 0; x <oldIntArray.length; x++) { //y�� 0���� newIntArray ����ŭ �ݺ�
			System.out.print(oldIntArray[x] + " ");
		}
		System.out.println();
		for(int j = 0; j <newIntArray.length; j++) { //y�� 0���� newIntArray ����ŭ �ݺ�
			System.out.print(newIntArray[j] + " ");
		}
	}

}

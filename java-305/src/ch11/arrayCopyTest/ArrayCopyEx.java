package ch11.arrayCopyTest;

import java.util.*;

public class ArrayCopyEx {

	public static void main(String[] args) {
		/*
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("-----------------------");
		
		//1���� 3�����ε� 3�� ���� ����
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("-----------------------");
		
		//arr1 ���̸�ŭ ���ο� �迭�� ���� arr4
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i = 0; i< arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
		*/
		
		int[][] original = {{1,2}, {3,4}};
		
		//���� ���� �� ��
		System.out.println("[���� ���� �� ��]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("�迭 ���� ��: " + original.equals(cloned1));
		System.out.println("1�� �迭 �׸� �� ��: " + Arrays.equals(original, cloned1));
		System.out.println("��ø �迭 �׸� �� ��: " + Arrays.deepEquals(original, cloned1));
		
		//���� ���� �� ��
		System.out.println("\n[���� ���� �� ��]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("�迭 ���� ��: " + original.equals(cloned2));
		System.out.println("1�� �迭 �׸� �� ��: " + Arrays.equals(original, cloned2));
		System.out.println("��ø �迭 �׸� �� ��: " + Arrays.deepEquals(original, cloned2));
	}

}

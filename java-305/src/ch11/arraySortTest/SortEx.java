package ch11.arraySortTest;

import java.util.*;

public class SortEx {

	public static void main(String[] args) {
		
		int[] scores = {99, 97, 98, 84, 57};
		Arrays.sort(scores); //�������� �����ڵ�
		for(int i = 0; i <scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		int index = Arrays.binarySearch(scores, 97); //�����ϰ� ��� ��.
		System.out.println("ã�� �ε��� : " + index);
		System.out.println();
		
		String[] names = {"������", "������", "������", "������", "������"};
		Arrays.sort(names);
		for(int i = 0; i <names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		int index1 = Arrays.binarySearch(names, "������"); //�����ϰ� ��� ��.
		System.out.println("ã�� �ε��� : " + index1);
		System.out.println();
		
		Member m1 = new Member("�ֿ���");
		Member m2 = new Member("������");
		Member m3 = new Member("������");
		Member m4 = new Member("ȫ����");
		Member m5 = new Member("��켷");
		
		Member[] members = {m1, m2, m3, m4, m5};
		Arrays.sort(members);
		for(int i = 0; i <members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].name);
		}
		int index2 = Arrays.binarySearch(members, m4);
		System.out.println("ã�� �ε��� : " + index2);
	}

}

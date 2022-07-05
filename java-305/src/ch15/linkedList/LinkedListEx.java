package ch15.linkedList;

import java.util.*;

public class LinkedListEx {
	//ArrayList�� LinkedList�� �߰�, ���� ���� ��
	//10000���� ��ü�� �����ϴµ� �ɸ� �ð��� ����
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long StartTime; //���� �ð� ������
		long endTime; //���� �ð� ������
		
		StartTime = System.nanoTime(); //���� �ð��� ���ϴ� ��
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð� : " + (endTime - StartTime) + " ns");
		
		StartTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð� : " + (endTime - StartTime) + " ns");
	}
}

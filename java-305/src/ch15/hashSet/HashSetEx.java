package ch15.hashSet;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java"); //0��° �ε���
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //���� ��ü�� 1���� ���� ��
		set.add("iBATIS"); //�� �ڿ� ��ü�� ����
		
		int size = set.size();
		System.out.println("�� ��ü �� : " +size);
		System.out.println();

		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) {//�ݺ��ڸ� ���ؼ� �˻� �� ���
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü �� : " +set.size()); //����� ��ü �� ���
		
		for(String element : set) {
			System.out.println("\t" + element);
		}

		set.clear();
	      if (set.isEmpty()) {
	         System.out.println("�������");
	      }
	}

}

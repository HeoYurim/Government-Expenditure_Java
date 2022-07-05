package ch15.arraylist;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //0��° �ε���
		list.add("JDBC");
		list.add("Servlet");
		list.add("JSP");
		list.add("Spring");
		list.add(2, "Spring Boot");
		list.add("myBATIS"); //�� �ڿ� ��ü�� ����
		
		int size = list.size();
		System.out.println("�� ��ü �� : " +size);
		System.out.println();
		
		String skill2 = list.get(2);
		System.out.println("2��° �ε��� �� : " + skill2);
		System.out.println();
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2); //2�� �ε��� �� ����
		list.remove(2); //2�� �ε��� �� ����
		list.remove("myBATIS"); //��ü ����
		
		for(String str1 : list) { //���� for��
			System.out.print(str1 + " : ");
		}
	}

}

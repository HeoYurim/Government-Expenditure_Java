package ch15.arraylist;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //0번째 인덱스
		list.add("JDBC");
		list.add("Servlet");
		list.add("JSP");
		list.add("Spring");
		list.add(2, "Spring Boot");
		list.add("myBATIS"); //맨 뒤에 객체를 삽입
		
		int size = list.size();
		System.out.println("총 객체 수 : " +size);
		System.out.println();
		
		String skill2 = list.get(2);
		System.out.println("2번째 인덱스 값 : " + skill2);
		System.out.println();
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2); //2번 인덱스 값 삭제
		list.remove(2); //2번 인덱스 값 삭제
		list.remove("myBATIS"); //객체 삭제
		
		for(String str1 : list) { //향상된 for문
			System.out.print(str1 + " : ");
		}
	}

}

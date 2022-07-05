package ch15.hashSet;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java"); //0번째 인덱스
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //같은 객체라 1번만 저장 됨
		set.add("iBATIS"); //맨 뒤에 객체를 삽입
		
		int size = set.size();
		System.out.println("총 객체 수 : " +size);
		System.out.println();

		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) {//반복자를 통해서 검색 후 출력
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : " +set.size()); //저장된 객체 수 얻기
		
		for(String element : set) {
			System.out.println("\t" + element);
		}

		set.clear();
	      if (set.isEmpty()) {
	         System.out.println("비어있음");
	      }
	}

}

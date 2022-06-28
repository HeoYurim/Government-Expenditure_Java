package ch11.arraySortTest;

import java.util.*;

public class SortEx {

	public static void main(String[] args) {
		
		int[] scores = {99, 97, 98, 84, 57};
		Arrays.sort(scores); //오름차순 정렬코드
		for(int i = 0; i <scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		int index = Arrays.binarySearch(scores, 97); //정렬하고 써야 됨.
		System.out.println("찾은 인덱스 : " + index);
		System.out.println();
		
		String[] names = {"정정민", "정지훈", "이윤진", "엄진영", "김재준"};
		Arrays.sort(names);
		for(int i = 0; i <names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		int index1 = Arrays.binarySearch(names, "정정민"); //정렬하고 써야 됨.
		System.out.println("찾은 인덱스 : " + index1);
		System.out.println();
		
		Member m1 = new Member("최영광");
		Member m2 = new Member("오준택");
		Member m3 = new Member("허유림");
		Member m4 = new Member("홍지영");
		Member m5 = new Member("노우섭");
		
		Member[] members = {m1, m2, m3, m4, m5};
		Arrays.sort(members);
		for(int i = 0; i <members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].name);
		}
		int index2 = Arrays.binarySearch(members, m4);
		System.out.println("찾은 인덱스 : " + index2);
	}

}

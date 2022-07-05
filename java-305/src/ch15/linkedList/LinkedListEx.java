package ch15.linkedList;

import java.util.*;

public class LinkedListEx {
	//ArrayList와 LinkedList의 추가, 삭제 성능 비교
	//10000개의 객체를 삽입하는데 걸린 시간을 측정
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long StartTime; //시작 시간 측정용
		long endTime; //종료 시간 측정용
		
		StartTime = System.nanoTime(); //시작 시간을 정하는 것
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - StartTime) + " ns");
		
		StartTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - StartTime) + " ns");
	}
}

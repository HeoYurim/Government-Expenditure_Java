package ch15.arrayaslist;

import java.util.*;

public class ArrayAsListEx {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("허유림" , "이윤진" , "엄진영");
		
		for(String name : list1) {
			System.out.println(name);
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}

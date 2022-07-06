package ch11;

import java.util.*;

public class Country {
	public static void main(String[] args) {
		//01
		List<String> capitals = new ArrayList<String>();
		
		capitals.add("서울");
		capitals.add("워싱턴");
		capitals.add("베이징");
		capitals.add("마드리드");
		capitals.add("파리");
		
		//02
		for(String str : capitals){ 
			System.out.print(str + " ");
		}
		System.out.println();
		
		//03
		capitals.add("런던");
		Iterator<String> iter = capitals.iterator();

		while(iter.hasNext()){ //false 반환, 있으면 true, 없으면 false
			System.out.print(iter.next() + " ");
		}
		
		//04
		
		
	}
}

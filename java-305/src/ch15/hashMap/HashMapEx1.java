package ch15.hashMap;

import java.util.*;

public class HashMapEx1 {
	//이름을 키로 점수를 값으로 저장
	public static void main(String[] args) {
		//Map 컬랙션 생성
		Map<String, Integer> map =  new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90); //같은 키가 저장되어 90점이 소멸
		map.put("동장군", 80);
		map.put("홍길동", 95); //같은 키가 저장되어 95점으로 저장
		
		System.out.println("총 Entry수 : " + map.size());
		
		//'홍길동' 키를 갖는 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리 -> keySet를 이용한 검색
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry수 : " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
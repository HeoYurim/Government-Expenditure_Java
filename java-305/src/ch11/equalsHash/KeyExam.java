package ch11.equalsHash;

import java.util.*;

public class KeyExam {

	public static void main(String[] args) {
		// key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// 컬렉션 변수 타입 저장객체

		// 식별키 "new Key(1)" 홍길동을 저장
		hashMap.put(new Key(1), "홍길동");

		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}

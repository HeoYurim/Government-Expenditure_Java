package ch11;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		//01
		Map<String, String> dic = new HashMap<String,String>();
		
		//02
		dic.put("head","대가빠리");
		dic.put("teacher","쌤");
		dic.put("cat","꼬네이");
		dic.put("aunt","아지매");
		dic.put("noodle","국시");
		dic.put("child","얼라");
		
		//03
		for( String key : dic.keySet() ){
			System.out.printf("%s=%s " , key, dic.get(key));
		}
	}
}
package ch11;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		//01
		Map<String, String> dic = new HashMap<String,String>();
		
		//02
		dic.put("head","�밡����");
		dic.put("teacher","��");
		dic.put("cat","������");
		dic.put("aunt","������");
		dic.put("noodle","����");
		dic.put("child","���");
		
		//03
		for( String key : dic.keySet() ){
			System.out.printf("%s=%s " , key, dic.get(key));
		}
	}
}
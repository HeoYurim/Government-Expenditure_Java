package ch11.property;

import java.util.*;

public class GetPtopertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("운영체제 이름 : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 이름 : " + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("사용자 이름 : " + userHome);
		
		System.out.println("---------------------");
		System.out.println("-----[key] value-----");
		System.out.println("---------------------");
		
		//모든 속성의 키 값을 출력
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println("["+key+"] " + value);
		}
		System.out.println("--------------------------------------------");
		String javaHome = System.getenv("Java_Home");
		System.out.println("JAVA_HOME : " + javaHome);
	}

}

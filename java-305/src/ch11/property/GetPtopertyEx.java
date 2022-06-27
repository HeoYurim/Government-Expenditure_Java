package ch11.property;

import java.util.*;

public class GetPtopertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("�ü�� �̸� : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("����� �̸� : " + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("����� �̸� : " + userHome);
		
		System.out.println("---------------------");
		System.out.println("-----[key] value-----");
		System.out.println("---------------------");
		
		//��� �Ӽ��� Ű ���� ���
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

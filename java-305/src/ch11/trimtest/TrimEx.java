package ch11.trimtest;

import java.util.*;

public class TrimEx {

	public static void main(String[] args) {
		
		String tel1 = "  010  ";
		String tel2 = "  1234  ";
		String tel3 = " 5678     ";
		
		String tel = tel1.trim() + ")" + tel2.trim() + "-"  + tel3.trim() ;
		
		System.out.println("������ ��ȭ��ȣ�� : " + tel);
		
		System.out.println("----------------");
		
		//������ ���ڿ��� ��ȯ
		String str1 = String.valueOf(10);
		//�Ǽ��� ���ڿ��� ��ȯ
		String str2 = String.valueOf(10.5);
		//�� ���� ���ڿ��� ��ȯ
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("----------------");
		
		String text = "������&�Ǽ���,����,����-�ֿ���";
		
		String[] names = text.split("&|,|-"); //&�̰ų� ,�̰ų� -
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("----------------");

		String text1 = "������/�谭��/������/���Ѻ�/��켷";
		
		StringTokenizer st1 = new StringTokenizer(text1, "/");
		
		while(st1.hasMoreTokens()) { //hasMoreTokens() ���� �ִ� ��ū ����
			String token = st1.nextToken();
			System.out.println(token);		
		}
		System.out.println();
		
		/*
		//how1 : ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text1, "/");
		
		//countTokens() ������ �ʰ� �����ִ� ��ū ��
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			//nextToken() ��ū�� �ϳ��� ������
			String token = st.nextToken();
			System.out.println(token);
		}
		*/
	}

}

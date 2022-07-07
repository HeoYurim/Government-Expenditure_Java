package ch10;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		String[] strings= {"�θ��� ���� �θ����� ������.","�ð��� ���̴�.","���� Į���� ���ϴ�."};
		
		Arrays.sort(strings, new Comparator<String>() { //�͸� ���� ��ü�μ� ���ڿ��� ���̸� ���Ѵ�.
			public int compare(String first, String second) {
				return first.length() - second.length();
			}
		});
		
		for(String s : strings)
			System.out.println(s);
	}

}

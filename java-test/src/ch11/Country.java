package ch11;

import java.util.*;

public class Country {
	public static void main(String[] args) {
		//01
		List<String> capitals = new ArrayList<String>();
		
		capitals.add("����");
		capitals.add("������");
		capitals.add("����¡");
		capitals.add("���帮��");
		capitals.add("�ĸ�");
		
		//02
		for(String str : capitals){ 
			System.out.print(str + " ");
		}
		System.out.println();
		
		//03
		capitals.add("����");
		Iterator<String> iter = capitals.iterator();

		while(iter.hasNext()){ //false ��ȯ, ������ true, ������ false
			System.out.print(iter.next() + " ");
		}
		
		//04
		
		
	}
}

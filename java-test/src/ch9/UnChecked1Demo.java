package ch9;

import java.util.*;

public class UnChecked1Demo {

	public static void main(String[] args) {
		
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " + ");
		}
		System.out.println(st.nextToken()); //���̻� ������ ��ū�� ���� �߻���Ų��.
	}

}
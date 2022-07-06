package ch09;

import java.util.*;

public class UnChecked1Demo {

	public static void main(String[] args) {
		
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " + ");
		}
		System.out.println(st.nextToken()); //더이상 가져올 토큰이 없어 발생시킨다.
	}

}

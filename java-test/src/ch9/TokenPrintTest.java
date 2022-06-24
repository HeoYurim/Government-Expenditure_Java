package ch9;

import java.util.*;

public class TokenPrintTest {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		try {
			showToken(s,", ");
		}catch(NoSuchElementException e) {
			System.out.println("��");
		}
	}

	public static void showToken(String s, String string) throws NoSuchElementException{
		
		String token;
		StringTokenizer st = new StringTokenizer(s, " ,");//���� �ϰ� �޸� ���� �ܾ�� ����
		while(true) {
			token = st.nextToken();
			System.out.println(token);
		}
	}
	
}

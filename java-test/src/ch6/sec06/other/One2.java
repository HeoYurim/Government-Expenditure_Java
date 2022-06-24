package ch6.sec06.other;

import ch6.sec06.*;

public class One2 extends One{
	
	void print() {
		//	System.out.println(secret); private 멤버에 접근 불가능
		//	System.out.println(roommate); 자식 클래스더라도 부모와 다른 패키지에 있다면 private과 default 멤버에 접근 불가
			System.out.println(child);
			System.out.println(anybody);
		}
}

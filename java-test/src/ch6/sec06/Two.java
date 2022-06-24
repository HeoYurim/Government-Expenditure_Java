package ch6.sec06;

public class Two {
	void print() {
		One o = new One();
		
	//	System.out.println(o.screct); //같은 패키지에 있어도 private은 불가능
		System.out.println(o.roommate);
		System.out.println(o.child);
		System.out.println(o.anybody);
	}
}

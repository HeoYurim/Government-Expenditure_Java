package ch07.extended.package2;

import ch07.extended.package1.*;

public class D extends A{
	public D() {
		super(); //부모 객체 소환
		this.field = "자바"; //가능
		this.method(); //가능
	}
}

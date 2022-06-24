package ch6.Girl;

public class Girl {
	
	protected String name;

	Girl(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println(name + " 자바 초보자이다.");
	};
	
	/* 2번
	private String name;
	Girl() {
	}

	Girl(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println("그녀는 자바 초보자이다.");
	};
	*/
}

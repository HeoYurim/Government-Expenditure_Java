package ch6.Girl;

public class Girl {
	
	protected String name;

	Girl(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println(name + " �ڹ� �ʺ����̴�.");
	};
	
	/* 2��
	private String name;
	Girl() {
	}

	Girl(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
	};
	*/
}

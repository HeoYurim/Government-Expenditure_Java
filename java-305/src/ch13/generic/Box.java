package ch13.generic;

public class Box<T> {
	private T t; //�ʵ� ����
	
	//Ÿ�� �Ķ���͸� ����Ͽ� Object Ÿ���� ��� T�� ��ü
	//Setter
	public void set(T t) {
		this.t = t;
	}
	
	//Getter
	public T get() {
		return t;
	}
}

/*
public class Box {
	private Object object; //�ʵ� ����
	
	//Setter
	public void set(Object object) {
		this.object = object;
	}
	
	//Getter
	public Object get() {
		return object;
	}
}
*/

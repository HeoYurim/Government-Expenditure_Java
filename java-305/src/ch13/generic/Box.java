package ch13.generic;

public class Box<T> {
	private T t; //필드 생성
	
	//타입 파라미터를 사용하여 Object 타입을 모두 T로 대체
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
	private Object object; //필드 생성
	
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

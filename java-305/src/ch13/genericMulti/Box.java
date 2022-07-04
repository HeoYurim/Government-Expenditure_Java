package ch13.genericMulti;

public class Box<T> {
	
	//Box<T> 제네릭 생성 T타입의 t필드를 생성 -> 게터 세터 생성
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
	
}

package ch13.genericMulti;

public class Box<T> {
	
	//Box<T> ���׸� ���� TŸ���� t�ʵ带 ���� -> ���� ���� ����
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
	
}

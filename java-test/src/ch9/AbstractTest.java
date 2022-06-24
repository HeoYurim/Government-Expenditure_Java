package ch9;

abstract class Abstract{
	int i;
	
	public Abstract(int i) {
		this.i = i;
	}
	abstract void show();
}

class Concreate extends Abstract{
	int j;
	
	public Concreate(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	void show() {
		System.out.println("i = " + i + ", j = " + j);
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {

		Concreate c = new Concreate(100, 50);
		c.show();
	}

}

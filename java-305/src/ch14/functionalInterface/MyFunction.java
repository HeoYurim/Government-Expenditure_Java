package ch14.functionalInterface;

@FunctionalInterface
public interface MyFunction {
	
	public void method();
	// 01 public void method();
	// 02 public void method(int x); //매개값이 있다
	// 03 public int method(int x, int y); //매개값이 있다
	//public void otherMethod();
}
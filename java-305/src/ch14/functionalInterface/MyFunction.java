package ch14.functionalInterface;

@FunctionalInterface
public interface MyFunction {
	
	public void method();
	// 01 public void method();
	// 02 public void method(int x); //�Ű����� �ִ�
	// 03 public int method(int x, int y); //�Ű����� �ִ�
	//public void otherMethod();
}
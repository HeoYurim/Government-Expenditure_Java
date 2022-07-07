package ch14.functionalInterface;

public class UsingThis {
	
	public int Field = 10; //�ܺ� �ʵ�
	
	class Inner{
		int Field = 20; //���� �ʵ�
		
		void method() {
			//���ٽ�
			MyFunction fi = () -> {
				System.out.println("outterField : " + Field);
				System.out.println("outterField : " + UsingThis.this.Field);
				
				System.out.println("innerField : " + Field);
				System.out.println("innerField : " + this.Field);
			};
			fi.method();
		}
	}
	
	/* 04
	public int outterField = 10; //�ܺ� �ʵ�
	
	class Inner{
		int innerField = 20; //���� �ʵ�
		
		void method() {
			//���ٽ�
			MyFunction fi = () -> {
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField);
				
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField);
			};
			fi.method();
		}
	}
	*/
}
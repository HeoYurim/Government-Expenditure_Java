package ch13.genericExtends;

public class BoundedTypeParameterEx {

	public static void main(String[] args) {
	//	String str = Util.compare("a", "b"); Number 상속 아님
		
		int result1 = Util.compare(10, 20); //int 자동 Boxing
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); //Double 자동 Boxing
		System.out.println(result2);
	}

}

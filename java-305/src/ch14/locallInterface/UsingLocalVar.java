package ch14.locallInterface;

public class UsingLocalVar {
	void method(int arg) { //arg는 final 특성을 가짐
		int localVar = 40; //localVar는 final 특성을 가짐
		
//		arg = 31; 		//final 특성 때문에 수정 불가
//		localVar = 41;  //final 특성 때문에 수정 불가
		
		//람다식
		MyFunctionInterface fi = () -> {
			//로컬 변수 사용
			System.out.println("arg: " + arg);
			System.out.println("localVar : " + localVar);
			System.out.println();
		};
		fi.method();
	}
}

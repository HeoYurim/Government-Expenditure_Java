package ch14.locallInterface;

public class UsingLocalVar {
	void method(int arg) { //arg�� final Ư���� ����
		int localVar = 40; //localVar�� final Ư���� ����
		
//		arg = 31; 		//final Ư�� ������ ���� �Ұ�
//		localVar = 41;  //final Ư�� ������ ���� �Ұ�
		
		//���ٽ�
		MyFunctionInterface fi = () -> {
			//���� ���� ���
			System.out.println("arg: " + arg);
			System.out.println("localVar : " + localVar);
			System.out.println();
		};
		fi.method();
	}
}

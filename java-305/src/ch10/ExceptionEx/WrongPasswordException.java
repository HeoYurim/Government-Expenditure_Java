package ch10.ExceptionEx;

public class WrongPasswordException extends Exception{

//	�߸��� �н����带 �Է����� ��� WrongPasswordException�� �߻�
//	-> �н����尡 �ٸ��ϴ�.
	
	public WrongPasswordException() { } //�⺻ ������
	public WrongPasswordException(String message) {  //����� ���� ������
		super(message);
	}
}

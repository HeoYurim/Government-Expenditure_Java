package ch10.ExceptionEx;

public class NotExistIDException extends Exception{
	
//	�α��� ����� Member Ŭ������ login() �޼ҵ忡 ����
//	�������� �ʴ� ID�� �Է����� ��� NotExistException�� �߻�
//	-> ID�� �������� �ʽ��ϴ�.
	public NotExistIDException() { } //�⺻ ������
	public NotExistIDException(String message) {  //����� ���� ������
		super(message);
	}
}

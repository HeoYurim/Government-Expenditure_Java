package ch10.clentException;

public class BalanceException extends Exception{
	
	//�⺻ ������ ����
	public  BalanceException() {}
	
	//�޼��� ���޿� ������ ����
	public BalanceException(String message) {
		super(message);
	}
	
} //Exception�� ��ӹޱ� ������ �����Ϸ��� ���� üũ�Ǵ� ����

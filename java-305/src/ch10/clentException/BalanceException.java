package ch10.clentException;

public class BalanceException extends Exception{
	
	//기본 생성자 선언
	public  BalanceException() {}
	
	//메세지 전달용 생성자 선언
	public BalanceException(String message) {
		super(message);
	}
	
} //Exception을 상속받기 때문에 컴파일러에 의해 체크되는 예외

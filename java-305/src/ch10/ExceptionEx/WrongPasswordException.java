package ch10.ExceptionEx;

public class WrongPasswordException extends Exception{

//	잘못된 패스워드를 입력했을 경우 WrongPasswordException을 발생
//	-> 패스워드가 다릅니다.
	
	public WrongPasswordException() { } //기본 생성자
	public WrongPasswordException(String message) {  //사용자 지정 생성자
		super(message);
	}
}

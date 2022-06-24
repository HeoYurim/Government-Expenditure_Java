package ch10.ExceptionEx;

public class NotExistIDException extends Exception{
	
//	로그인 기능을 Member 클래스의 login() 메소드에 구현
//	존재하지 않는 ID를 입력했을 경우 NotExistException을 발생
//	-> ID가 존재하지 않습니다.
	public NotExistIDException() { } //기본 생성자
	public NotExistIDException(String message) {  //사용자 지정 생성자
		super(message);
	}
}

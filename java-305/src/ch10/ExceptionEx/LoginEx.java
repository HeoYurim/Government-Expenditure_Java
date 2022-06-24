package ch10.ExceptionEx;

public class LoginEx{

	public static void main(String[] args) {

		try {
			login("kkw","12345");
			System.out.println("정상 로그인 되었습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("hyr","990323");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
		//id가 kkw이 아니라면 NotExistIdException 발생
		if(!id.equals("kkw")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}		
		//password가 12345이 아니라면 WrongPasswordException 발생
		if(!password.equals("12345")) {
			throw new WrongPasswordException("비밀번호가 존재하지 않습니다.");
		}
	}

}

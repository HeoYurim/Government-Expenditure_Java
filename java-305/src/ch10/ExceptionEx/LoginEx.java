package ch10.ExceptionEx;

public class LoginEx{

	public static void main(String[] args) {

		try {
			login("kkw","12345");
			System.out.println("���� �α��� �Ǿ����ϴ�.");
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
		//id�� kkw�� �ƴ϶�� NotExistIdException �߻�
		if(!id.equals("kkw")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}		
		//password�� 12345�� �ƴ϶�� WrongPasswordException �߻�
		if(!password.equals("12345")) {
			throw new WrongPasswordException("��й�ȣ�� �������� �ʽ��ϴ�.");
		}
	}

}

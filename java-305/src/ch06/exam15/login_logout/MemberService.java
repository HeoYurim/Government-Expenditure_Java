package ch06.exam15.login_logout;

public class MemberService {
	
	static boolean login(String id, String password) {
		
		if(id.equals("hong") || password.equals("12345")) {
			return true;
		}else {
			return false;
		}		
	}
	
	void logout(String id) {
		System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
	}

	
	
}

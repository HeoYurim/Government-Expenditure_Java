package ch11.property;

public class GetPtopertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("운영체제 이름 : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 이름 : " + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("사용자 이름 : " + userHome);
	}

}

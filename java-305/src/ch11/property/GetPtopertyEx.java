package ch11.property;

public class GetPtopertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("�ü�� �̸� : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("����� �̸� : " + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("����� �̸� : " + userHome);
	}

}

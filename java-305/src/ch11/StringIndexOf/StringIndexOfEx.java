package ch11.StringIndexOf;

public class StringIndexOfEx {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
			System.out.println("���� 13���ڷ� �Է����ּ���.");
		}
		
		System.out.println("-------------------");
		String oldStr = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		System.out.println("-------------------");
		String ssn1 = "880815-1234567";
		
		String firstNum = ssn1.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn1.substring(7);
		System.out.println(secondNum);
		
		String str1 = "Java programming";
		String str2 = "JAVA programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		//equals �޼ҵ�� ���� ������ ��ġ(��ҹ��� ����)
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase ���� ������ ��ġ(��ҹ��� ���� ����)
	}

}

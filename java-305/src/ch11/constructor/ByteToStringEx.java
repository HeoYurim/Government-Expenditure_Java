package ch11.constructor;

public class ByteToStringEx {

	public static void main(String[] args) {
		
		//바이트 배열을 문자열로 변환하는 예제 72 -> H, 101 -> e
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); //6번째부터 4개 (0번부터 세야됨) 
		System.out.println(str2);
	}

}

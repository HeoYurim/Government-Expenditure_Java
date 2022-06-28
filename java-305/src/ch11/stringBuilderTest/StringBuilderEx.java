package ch11.stringBuilderTest;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString()); //System.out.println(sb);
		
		sb.insert(4,"2"); //4번째 문자 뒤에 2삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		//버퍼에 있는 것을 String 타입으로 리턴
		String result = sb.toString();
		System.out.println(result);

	}

}

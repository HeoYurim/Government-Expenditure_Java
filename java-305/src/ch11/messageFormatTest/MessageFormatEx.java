package ch11.messageFormatTest;

import java.text.*;

public class MessageFormatEx {

	public static void main(String[] args) {
		String id = "hyr";
		String name = "허유림";
		String tel = "010-1234-5678";
		
		String text = "회원 ID : {0} \n회원이름 : {1} \n회원전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = { "'java'", "'신용권'", "'010-9876-5432'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}

}

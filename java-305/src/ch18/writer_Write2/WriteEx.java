package ch18.writer_Write2;

import java.io.*;

public class WriteEx {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		String data = "�ȳ� �ڹ� ���α׷�";
		//writer.write(data);
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
	}

}

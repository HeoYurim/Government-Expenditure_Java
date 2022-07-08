package ch18.reader_Read2;

import java.io.*;

public class ReadEx2 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test1.txt");
		
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0 ,readCharNo);
			System.out.println(data);
		}
		reader.close();
	}

}

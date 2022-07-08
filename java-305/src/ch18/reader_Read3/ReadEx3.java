package ch18.reader_Read3;

import java.io.*;

public class ReadEx3 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test1.txt");
		
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf, 1, 2); //1∫Œ≈Õ 2∞≥
		
		for(int i = 0; i < cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}

}

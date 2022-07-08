package ch18.reader_Read1;

import java.io.*;

public class ReadEx {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test1.txt");
		int readData;
		while(true) {
			readData =  reader.read();
			if(readData == -1) break;
			System.out.println((char)readData);
		}
		reader.close();
	}

}

package ch18.writer_Write1;

import java.io.*;

public class WriteEx1 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test1.txt");
		char[] data = "허유림hyr-mit".toCharArray();
		
		for(int i=0; i<data.length; i++) {
			writer.write(data[i] + " ");
		}
		writer.flush();
		writer.close();
		System.out.println("C:/Temp/test1.txt 파일을 확인하세요");
	}

}

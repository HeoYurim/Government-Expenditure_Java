package ch18.outputStream_Write2;

import java.io.*;

public class WriteEx2 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "안녕하세요 자바입니다.".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}

}

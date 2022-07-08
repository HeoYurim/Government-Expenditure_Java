package ch18.outputStream_Write1;

import java.io.*;

public class WriteEx1 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "가나다".getBytes();
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		System.out.println("C:/Temp/test/txt 파일을 확인해보세요");
		os.flush();
		os.close();
	}

}

package ch18.outputStream_Write1;

import java.io.*;

public class WriteEx1 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "������".getBytes();
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		System.out.println("C:/Temp/test/txt ������ Ȯ���غ�����");
		os.flush();
		os.close();
	}

}

package ch18.inputstream_Write3;

import java.io.*;

public class WriteEx3 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "«„¿Ø∏≤".getBytes();
		os.write(data,2 ,2);
		os.flush();
		os.close();
	}

}

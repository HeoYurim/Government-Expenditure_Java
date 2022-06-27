package ch11.StringGetBytes;

import java.io.*;

public class StringGetBytesEx {

	public static void main(String[] args) {
		String str="안녕하세요";
		
		byte[] byte1 = str.getBytes();
		System.out.println("byte1.length: " + byte1.length);
		String str1 = new String(byte1);
		System.out.println("byte1->String: " + str1);
		
		System.out.println("-----------------------------");
		
		try {
			byte[] byte2 = str.getBytes("EUC-KR"); //EUC-KR 인코딩
			System.out.println("byte2.length: " + byte2.length);
			String str2 = new String(byte2, "EUC-KR"); //EUC-KR 디코딩
			System.out.println("byte2->String: " + str2);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------");
		
		try {
			byte[] byte3 = str.getBytes("UTF-8"); //EUC-KR 인코딩
			System.out.println("byte3.length: " + byte3.length);
			String str3 = new String(byte3, "UTF-8"); //EUC-KR 디코딩
			System.out.println("byte3->String: " + str3);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}

package ch11.constructorKB;

import java.io.*;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		
		//byte 배열 100칸 생성
		byte[] bytes = new byte[100];
		
		//System 내장된 read 메소드를 이용한 키보드 입력
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		
		//바이트로 입력된 값에는 엔터에 대한 바이트코드도 넘어오기 때문에 -2를 준다.
		//엔터는 캐리지리턴(\r), 라인피트(\n)을 제외한다.
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}

package ch11.constructorKB;

import java.io.*;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		
		//byte �迭 100ĭ ����
		byte[] bytes = new byte[100];
		
		//System ����� read �޼ҵ带 �̿��� Ű���� �Է�
		System.out.print("�Է� : ");
		int readByteNo = System.in.read(bytes);
		
		//����Ʈ�� �Էµ� ������ ���Ϳ� ���� ����Ʈ�ڵ嵵 �Ѿ���� ������ -2�� �ش�.
		//���ʹ� ĳ��������(\r), ������Ʈ(\n)�� �����Ѵ�.
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}

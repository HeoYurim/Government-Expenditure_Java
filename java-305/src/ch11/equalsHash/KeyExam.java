package ch11.equalsHash;

import java.util.*;

public class KeyExam {

	public static void main(String[] args) {
		// key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// �÷��� ���� Ÿ�� ���尴ü

		// �ĺ�Ű "new Key(1)" ȫ�浿�� ����
		hashMap.put(new Key(1), "ȫ�浿");

		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}

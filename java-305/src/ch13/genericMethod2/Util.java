package ch13.genericMethod2;

public class Util {
	public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		//key ���� �������� ���ϴ� �޼�
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		//value ���� ������� ���ϴ� �޼ҵ�
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare; //Ű�� ���� ����� ����
	}
}

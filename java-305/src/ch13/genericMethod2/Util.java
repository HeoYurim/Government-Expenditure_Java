package ch13.genericMethod2;

public class Util {
	public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		//key 값이 동등한지 비교하는 메소
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		//value 값이 동등ㅇ한지 비교하는 메소드
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare; //키와 값이 동등값을 리턴
	}
}

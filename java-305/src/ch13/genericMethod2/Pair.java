package ch13.genericMethod2;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	} //持失切 識情

	public K getKey() {return key;}
	public V getValue() {return value;}

	public void setKey(K key) {this.key = key;}
	public void setValue(V value) {this.value = value;}
	
}

package ch11.thinClone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String pw;
	public int age;
	public boolean adult;
	public Member(String id, String name, String pw, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
			//clone() 메소드의 리턴 타입은 Object이므로 Member 타입으로 캐스팅
		}catch(CloneNotSupportedException e) {
			
		} return cloned;
	}
}

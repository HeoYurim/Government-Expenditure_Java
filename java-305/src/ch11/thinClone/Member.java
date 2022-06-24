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
			//clone() �޼ҵ��� ���� Ÿ���� Object�̹Ƿ� Member Ÿ������ ĳ����
		}catch(CloneNotSupportedException e) {
			
		} return cloned;
	}
}

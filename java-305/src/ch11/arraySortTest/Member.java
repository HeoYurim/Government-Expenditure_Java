package ch11.arraySortTest;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}
	
	//compareTo �񱳰��� ����
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	
}

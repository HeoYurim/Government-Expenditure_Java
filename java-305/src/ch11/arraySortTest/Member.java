package ch11.arraySortTest;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}
	
	//compareTo 비교값을 리턴
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	
}

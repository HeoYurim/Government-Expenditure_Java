package ch07.extended.abstractex;

public class SmartPhone extends Phone{
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	} //팀원이 추상을 이용하여 자동으로 생성
	
	//메소드(팀장이 만든 것 외적으로 동작을 생성한다)
	public void internetSerarch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	
}

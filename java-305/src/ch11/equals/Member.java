package ch11.equals;

public class Member {
	public String id; // 필드

	public Member(String id) {
		this.id = id;
	} // 생성자

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// 매개값이 Member 타입인지 확인
			Member member = (Member) obj;
			// Member 타입으로 강제 타입 변환
			if (id.equals(member.id)) {
				// 필드에 id 값이 동일한지 검사
				return true;// 동일하면 true 값 리턴
			}
		}
		return false; // 동일하지 않으면 false 값을 리턴한다.
	}
}

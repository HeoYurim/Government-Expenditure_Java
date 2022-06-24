package ch11.equalsHash;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override // equals 재정의
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			// compareKey 내부 데이터 호출용 변수
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// hashCode() 재정의
	@Override
	public int hashCode() {
		return number;
	}
}

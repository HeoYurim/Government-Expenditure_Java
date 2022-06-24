package ch11.equalsHash;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override // equals ������
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			// compareKey ���� ������ ȣ��� ����
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// hashCode() ������
	@Override
	public int hashCode() {
		return number;
	}
}

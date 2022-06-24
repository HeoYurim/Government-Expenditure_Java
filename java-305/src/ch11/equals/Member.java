package ch11.equals;

public class Member {
	public String id; // �ʵ�

	public Member(String id) {
		this.id = id;
	} // ������

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// �Ű����� Member Ÿ������ Ȯ��
			Member member = (Member) obj;
			// Member Ÿ������ ���� Ÿ�� ��ȯ
			if (id.equals(member.id)) {
				// �ʵ忡 id ���� �������� �˻�
				return true;// �����ϸ� true �� ����
			}
		}
		return false; // �������� ������ false ���� �����Ѵ�.
	}
}

package ch11.thinClone;

public class MemberExam {

	public static void main(String[] args) {
		Member orginal = new Member("kkw","����", "12345", 25, true);
		// ȸ������ �ڷḦ Member ��ü�� ����
		
		Member cloned = orginal.getMember();
		// ���� ��ü�� ����
		cloned.pw = "54321";
		// ���� ��ü�� ��ȣ�� ������
		System.out.println("���� ��ü�� �ʵ� ��");
		System.out.println("id : "+cloned.id);
		System.out.println("�̸� : "+cloned.name);
		System.out.println("��ȣ : "+cloned.pw);
		System.out.println("���� : "+cloned.age);
		System.out.println("�������� : "+cloned.adult);
		System.out.println("--------------------");
		System.out.println("���� ��ü�� �ʵ� ��");
		System.out.println("id : "+orginal.id);
		System.out.println("�̸� : "+orginal.name);
		System.out.println("��ȣ : "+orginal.pw);
		System.out.println("���� : "+orginal.age);
		System.out.println("�������� : "+orginal.adult);
	}

}

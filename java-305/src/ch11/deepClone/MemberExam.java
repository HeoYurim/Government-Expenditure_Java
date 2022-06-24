package ch11.deepClone;

public class MemberExam {

	public static void main(String[] args) {
		Member original = new Member("����", 25, new int[] { 90, 80 }, new Car("����"));
		// ���� ���� ����� new �����ڸ� �̿��� ���� ���� ��ü
		
		// ���� ��ü�� ���� �� ���� ��ü�� ���� �����غ���.
		Member cloned = original.getMember();
		// ���� ����
		cloned.name = "������Ƽ";
		cloned.scores[0] = 100;
		cloned.car.model = "�ƿ��";
		
		System.out.println("���� ��ü�� �ʵ� ��");
		System.out.println("�̸� : " + cloned.name);
		System.out.println("���� : " + cloned.age);
		System.out.print("���� : ");
		for(int i=0;i<cloned.scores.length;i++) {
			System.out.print(cloned.scores[i]+"��");
			System.out.print(i==(cloned.scores.length-1)?"":", ");
		}
		System.out.println(); // ���� �迭 ��ü ���
		System.out.println("Car : " + original.car.model); // Car ��ü�� �𵨰� ���
		System.out.println("-----------------------");
		System.out.println("���� ��ü�� �ʵ� ��");
		System.out.println("�̸� : " + original.name);
		System.out.println("���� : " + original.age);
		System.out.print("���� : ");
		for(int i=0;i<original.scores.length;i++) {
			System.out.print(original.scores[i]+"��");
			System.out.print(i==(original.scores.length-1)?"":", ");
		}
		System.out.println(); // ���� �迭 ��ü ���
		System.out.println("Car : " + original.car.model); // Car ��ü�� �𵨰� ���
	}

}

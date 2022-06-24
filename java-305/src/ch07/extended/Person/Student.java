package ch07.extended.Person;

public class Student extends Person{
	
	int studentnum; //�ڽ� �ʵ� �߰�
	String studentgrade;
	int studentschoolnum;
	
	//������
	Student(String name, double cm, int age, double kg, int studentnum, String studentgrade, int studentschoolnum) {

		this.name = name; //�θ��ʵ�
		this.cm = cm; //�θ��ʵ�
		this.age = age; //�θ��ʵ�
		this.kg = kg; //�θ��ʵ�
		this.studentnum = studentnum; //�ڽ��ʵ�
		this.studentgrade = studentgrade; //�ڽ��ʵ�
		this.studentschoolnum = studentschoolnum; //�ڽ��ʵ�
	}
	
	void receiveOn() {
		System.out.println("Student ������ �޽��ϴ�.");
	}
	
	void receiveOff() {
		System.out.println("Student ������ �޽��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		//�����ڷ� �ʱⰪ ����
		Student sp = new Student("MIT", 162.1, 25, 58.4, 201858068, "A", 4);
		
		sp.StudentOn();
		
		//�θ�� ���� �ʵ� Ȱ�� ���
		System.out.println("�̸� : " + sp.name);
		System.out.println("Ű : " + sp.cm);
		System.out.println("���� : " + sp.age);
		System.out.println("������ : " + sp.kg);
		System.out.println("�й� : " + sp.studentnum);
		System.out.println("���� : " + sp.studentgrade);
		System.out.println("�г� : " + sp.studentschoolnum);
		
		sp.StudentOff();
	}
	
}

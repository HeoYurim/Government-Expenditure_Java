package ch07.extended.Person;

public class Teacher extends Person{
	
	//�ʵ�
	int Teachernum;
	int monthMoney;
	int year;
	
	//������
	Teacher(String name, double cm, int age, double kg, int Teachernum, int monthMoney, int year) {
		
		this.name = name; //�θ��ʵ�
		this.cm = cm; //�θ��ʵ�
		this.age = age; //�θ��ʵ�
		this.kg = kg; //�θ��ʵ�
		this.Teachernum = Teachernum; //�ڽ��ʵ�
		this.monthMoney = monthMoney; //�ڽ��ʵ�
		this.year = year; //�ڽ��ʵ�
	
	}
	void receiveOn() {
		System.out.println("Teacher ������ �޽��ϴ�.");
	}
	
	void receiveOff() {
		System.out.println("Teacher ������ �޽��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		Teacher tp = new Teacher("Tom", 187.6 , 29, 87, 20114902, 300, 4);
		
		tp.TeacherOn();
		
		//�θ�� ���� �ʵ� Ȱ�� ���
		System.out.println("�̸� : " + tp.name);
		System.out.println("Ű : " + tp.cm);
		System.out.println("���� : " + tp.age);
		System.out.println("������ : " + tp.kg);
		System.out.println("��������ȣ : " + tp.Teachernum);
		System.out.println("���� : " + tp.monthMoney);
		System.out.println("���� : " + tp.year);
		
		tp.TeacherOff();
	}

}

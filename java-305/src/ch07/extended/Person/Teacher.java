package ch07.extended.Person;

public class Teacher extends Person{
	
	//필드
	int Teachernum;
	int monthMoney;
	int year;
	
	//생성자
	Teacher(String name, double cm, int age, double kg, int Teachernum, int monthMoney, int year) {
		
		this.name = name; //부모필드
		this.cm = cm; //부모필드
		this.age = age; //부모필드
		this.kg = kg; //부모필드
		this.Teachernum = Teachernum; //자식필드
		this.monthMoney = monthMoney; //자식필드
		this.year = year; //자식필드
	
	}
	void receiveOn() {
		System.out.println("Teacher 정보를 받습니다.");
	}
	
	void receiveOff() {
		System.out.println("Teacher 정보를 받습니다.");
	}
	
	public static void main(String[] args) {
		
		Teacher tp = new Teacher("Tom", 187.6 , 29, 87, 20114902, 300, 4);
		
		tp.TeacherOn();
		
		//부모로 받은 필드 활용 출력
		System.out.println("이름 : " + tp.name);
		System.out.println("키 : " + tp.cm);
		System.out.println("나이 : " + tp.age);
		System.out.println("몸무게 : " + tp.kg);
		System.out.println("교직원번호 : " + tp.Teachernum);
		System.out.println("월급 : " + tp.monthMoney);
		System.out.println("년차 : " + tp.year);
		
		tp.TeacherOff();
	}

}

package ch06;

public class PersonEx {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "������");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	//	p1.nation = "USA";  -> final �ʵ�� ������ �� ����
	//	p1.ssn = "654321-7654321"; -> final�ʱⰪ�� �̹� �����
		p1.name = "������Ƽ";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}

}

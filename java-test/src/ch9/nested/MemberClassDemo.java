package ch9.nested;

public class MemberClassDemo {

	private String secret = "�����";
	String s = "�ܺ�";
	
	class MemberClass{
		String s = "����";
		
		public void show1() {
			System.out.println("���� Ŭ����");
			System.out.println(secret);
			
			System.out.println(s); //���� s
			
			System.out.println(MemberClassDemo.this.s); //�ܺ� s
		}
	}
	
	public static void main(String[] args) {
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();
		
		System.out.println(m1.s);
		m1.show1();
	}
}

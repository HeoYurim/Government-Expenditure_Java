package ch09.anonymousEx;

public class Anonymous {
	
	//�ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�");
		}
		@Override
		void wake(){
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}	
	};
	
	void method1() { //���� ���������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		}; //���� ���� ����� �ʱⰪ ����
		localVar.wake(); //���� ���� ���
	}
	
	void method2(Person person) {
		person.wake();
	}
}

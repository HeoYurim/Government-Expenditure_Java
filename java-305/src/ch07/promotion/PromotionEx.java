package ch07.promotion;

class A{} //�θ� Ŭ����

class B extends A{} //�ڽ� Ŭ����
class C extends A{} //�ڳ� Ŭ����

class D extends B{} //���� Ŭ����
class E extends C{} //�ճ� Ŭ����

public class PromotionEx {
	
	public static void main(String[] args) {

		B b = new B(); //�ڽ� ��ü ����
		C c = new C(); //�ڳ� ��ü ����
		D d = new D(); //���� ��ü ����
		E e = new E(); //�ճ� ��ü ����
		
		A a1 = b; //�θ� ��ü�� �ڽ��� ���� a1�� ����
		A a2 = c;
		A a3 = d; 
		A a4 = e; 
		
		B b1 = d; //�ڽ� ��ü�� ���ڸ� ���� b1 ����
		C c1 = e; //�ڳ� ��ü�� �ճฦ ���� c1 ����
		
//		B b2 = e; //������ ���� (��Ӱ��谡 �ƴ�)
//		C c2 = d; //������ ���� (��Ӱ��谡 �ƴ�)
		
	}

}

package ch10;

interface Negative {int neg(int x);} //�Լ��� �������̽�
interface Printable {void print(); } //�Լ��� �������̽�

public class Lamda2Demo {

	public static void main(String[] args) {
		Negative n;
		Printable p;
		
		n = (int x) -> {return -x;};
		n = (x) -> {return -x;};
		n = x -> {return -x;};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x;
		
		p = () -> {System.out.println("�ȳ�!");};
		p = () -> System.out.println("�ȳ�!");
		
		p.print();
	}

}

package ch10;

interface Negative {int neg(int x);} //함수형 인터페이스
interface Printable {void print(); } //함수형 인터페이스

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
		
		p = () -> {System.out.println("안녕!");};
		p = () -> System.out.println("안녕!");
		
		p.print();
	}

}

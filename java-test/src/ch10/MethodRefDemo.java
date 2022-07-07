package ch10;

interface Mathematical {double calculate(double d);} //함수형 인터페이스
interface Pickable {char pick(String s, int i);} //함수형 인터페이스
interface Computable {int compute(int x, int y);} //함수형 인터페이스

class Utils{ //인스턴스 메서드 참조 예를 들기 위하여 인스턴스 메서드를 포함한 클래스를 정의
	int add(int a, int b) {return a + b;}
}

public class MethodRefDemo {

	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;
		
		m = Math::abs; //정적 메소드 참조
		System.out.println(m.calculate(-50.3));
		
		p = String::charAt; //인스턴스 메서드 참조 1이다.
		System.out.println(p.pick("안녕, 인스턴스 메서드 참조!", 4));
		
		Utils utils = new Utils();
		c = utils::add; //인스턴스 메서드 참조 2이다.
		System.out.println(c.compute(20, 30));
	}

}

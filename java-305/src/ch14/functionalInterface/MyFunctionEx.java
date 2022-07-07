package ch14.functionalInterface;

public class MyFunctionEx {

	public static void main(String[] args) {
		
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner(); //람다식 메소드
		inner.method();
		
		/* 01
		MyFunction fi;
		
		fi = () -> { //매개 변수가 없는 호출
			String str = "method call1";
			System.out.println(str);
		}; //익명 함수		
		fi.method(); //실행문 2개인 메소드 실행
		
		fi = () -> {System.out.println("method call2"); };		
		fi.method(); //실행문이 1개인 메소드 실행	
		
		fi = () -> System.out.println("method call3");		
		fi.method(); //실행문이 1개인 메소드 실행은 중괄호 블록 생략 가능
		*/
		
		/*02
		MyFunction fi;
		
		fi = (x) -> { //매개 변수가 없는 호출
			int result = x * 5;
			System.out.println(result); //x * 5 값이 출력
		}; //익명 함수		
		fi.method(2); //실행문 2개인 메소드 실행 2 * 5 = 10
		
		fi = (x) -> {System.out.println(x * 5); };		
		fi.method(4); //실행문 2개인 메소드 실행 4 * 5 = 10
		
		fi = (x) -> System.out.println(x * 5);		
		fi.method(8); //실행문이 1개인 메소드 실행은 중괄호 블록 생략 가능
		
		}
		 */
		
		/*03
		MyFunction fi;
		
		fi = (x,y) -> { //매개 변수가 없는 호출
			int result = x + y;
			return result; // x + y값이 출력
		}; //익명 함수		
		System.out.println(fi.method(2 , 5)); //실행문 2개인 메소드 실행 2 + 5 = 7
		
		fi = (x , y) -> {return x + y ;};		
		System.out.println(fi.method(2, 5)); //리턴문 넣은 람다식
		
		fi = (x , y) -> x + y;		
		System.out.println(fi.method(8, 5)); //실행문이 1개인 메소드 실행은 중괄호 블록 생략 가능
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(9, 5)); //9 + 5 = 14
		}
		
		public static int sum(int x, int y) {
			return(x + y);
		}*/
		
		/*04
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner(); //람다식 메소드
		inner.method();
		*/
	}
}
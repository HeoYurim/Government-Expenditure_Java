package ch11.Boxingtest;

public class BoxingExam {

	public static void main(String[] args) {

		//Boxing
		Integer obj1 = new Integer(100);		
		Integer obj2 = new Integer("200"); //""라고 해서 "김"이라고 넣을 수 있는건 아님
		Integer obj3 = Integer.valueOf(300);
		
		//UnBoxing : 객체화된 값을 기본 타입으로 변환
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
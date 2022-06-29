package ch11.autoBoxingtest;

public class AutoBoxEx {

	public static void main(String[] args) {
		//자동박싱
		Integer obj = 100; // Integer obj = new Integer(100);
		System.out.println("value : " + obj.intValue());
		
		System.out.println("-------------------");
		
		//대입시 자동 언박싱
		int value = obj; //Integer 객체 값을 int 타입으로 언박싱
		System.out.println("value : " + value);
		
		System.out.println("-------------------");
		
		//연산시 자동 언박싱
		int result = obj + 100;
		System.out.println("value : " + result);
		
		System.out.println("-------------------");
		
		//문자열을 기본 타입 값으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("Integer : " + value1);
		System.out.println("Double : " + value2);
		System.out.println("Boolean : " + value3);
		
		System.out.println("-------------------");
		
		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱 후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱 후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
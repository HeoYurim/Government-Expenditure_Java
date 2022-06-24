package ch05;

public class StringNullEx {

	public static void main(String[] args) {
		
		String strVar1 = "허유림";
		String strVar2 = "김기원";
		String strVar3 = new String("허유림");
		
		if(strVar1== strVar2) {
			System.out.println("strVal1과 strVal2는 참조가 같습니다.");
		}else {
			System.out.println("strVal1과 strVal2는 참조가 다릅니다.");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같습니다.");
		}else {
			System.out.println("strVal1과 strVal2는 문자열이 다릅니다.");
		}
		if(strVar1.equals(strVar3)) {
			System.out.println("strVal1과 strVal3는 문자열이 같습니다.");
		}else {
			System.out.println("strVal1과 strVal3는 문자열이 다릅니다.");
		}
		if(strVar3.equals(strVar3)) {
			System.out.println("strVal3과 strVal3는 문자열이 같습니다.");
		}else {
			System.out.println("strVal3과 strVal3는 문자열이 다릅니다.");
		}
		
	
		/*
		String name = null;
		name = "허유림";
		String hobby = "볼링";
		
		System.out.println("name 총 문자 수 : " + name.length());
		System.out.println("hobby 총 문자 수 : " + hobby.length());
		*/
	}

}

package ch05;

public class ArrayEqualsEx {

	public static void main(String[] args) {

		String[] strArray = new String[3];	//strArray변수에 1차원 3칸 배열을 생성한다.
		strArray[0] = "Java";	//strArray 0번째에 Java String 객체를 생성하여 연결한다.
		strArray[1] = "Java";	//strArray 1번째에 Java String 객체가 이미 있어 연결한다.
		strArray[2] = new String ("Java"); //new 연산자를 이용하여 새로 생성한 객체를 연결

		System.out.println("strArray 0번과 1번 동등비교 : "  + (strArray[0] == strArray[1])); //true
		System.out.println("strArray 0번과 2번 동등비교 : "  + (strArray[0] == strArray[2])); //false
		System.out.println("strArray 0번과 2번 내용비교 : "  + strArray[0].equals(strArray[2])); //true

	}

}
